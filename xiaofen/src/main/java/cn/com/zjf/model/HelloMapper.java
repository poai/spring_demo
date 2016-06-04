package cn.com.zjf.model;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;



@MapperScan
public interface HelloMapper {

	@Select("select * from hello where id=#{id}")
	public Hello get(Integer id);
	@Insert("insert into hello(message) values(#{message})")
	public void save(Hello hello);
}
