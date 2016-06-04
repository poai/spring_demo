package cn.com.zjf.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Component;

import com.mchange.v2.c3p0.ComboPooledDataSource;


@Component
@Scope("prototype")
public class Db {
	private Connection conn = null;
	private Statement stat = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private ResultSetMetaData rst = null;
	
	@Autowired
	private ComboPooledDataSource dataSource;

	private Connection setConn() {
		try {
			/*从处于事物环境中的dataSource中获取连接*/
			conn = DataSourceUtils.getConnection(dataSource);
		} catch (Exception e) {
			System.out.println("数据源连接失败,请检查！");
		}
		return conn;
	}

	private PreparedStatement setPs(String sql) {
		setConn();
		try {
			ps = conn.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("创建查询结果集失败,请检查！");
			e.printStackTrace();
		}
		return ps;
	}

	
	public int update(String sql, Object[] obj) {
		ps = setPs(sql);
		try {
			for (int i = 0; i < obj.length; i++) {
				ps.setObject(i + 1, obj[i]);

			}
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("更新失败,请检查！");
			e.printStackTrace();
		} finally {
		}
		return -1;
	}

	public int update(String sql) {
		return update(sql, new Object[] {});
	}

	public List<Map<String, Object>> query(String sql, Object[] obj) {
		List<Map<String, Object>> list = new LinkedList<Map<String, Object>>();
		setPs(sql);
		try {
			for (int i = 1; i <= obj.length; i++) {
				ps.setObject(i, obj[i - 1]);
			}
			rs = ps.executeQuery();
			rst = rs.getMetaData();
			while (rs.next()) {
				Map<String, Object> map = new HashMap<String, Object>();
				for (int i = 1; i <= rst.getColumnCount(); i++) {
					String key = rst.getColumnName(i);
					map.put(key, rs.getString(key));
				}
				list.add(map);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("查询出现异常！");
			e.printStackTrace();
		} finally {
		}
		return list;
	}

	public List<Map<String, Object>> query(String sql) {
		return query(sql, new Object[] {});
	}

	public void batch(String strs[]) {
		try {
			stat = setConn().createStatement();
			conn.setAutoCommit(false);
			for (String st : strs) {
				stat.addBatch(st);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			stat.executeBatch();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				conn.commit();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
