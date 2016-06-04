package cn.com.zjf.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.zjf.model.Hello;
import cn.com.zjf.model.HelloMapper;


@Service
public class HelloService {

	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	private SqlSession sqlSession;
	
	@Transactional
	public void save(Hello hello){
		sqlSession=sqlSessionFactory.openSession();
		sqlSession.insert("cn.com.zjf.model.HelloMapper.save",hello);
	}
	
	@Transactional
	public Hello get(Integer id){
		
		sqlSession=sqlSessionFactory.openSession();
		HelloMapper helloMapper=sqlSession.getMapper(HelloMapper.class);
		Hello hello=helloMapper.get(id);
		System.out.println(hello);
		return hello;
	}
}
