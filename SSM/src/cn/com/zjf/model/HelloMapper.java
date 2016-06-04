package cn.com.zjf.model;

import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;



@MapperScan
public interface HelloMapper {

	@Select("select * from hello where id=#{id}")
	public Hello get(Integer id);
}
