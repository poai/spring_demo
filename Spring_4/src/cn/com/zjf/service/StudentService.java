package cn.com.zjf.service;

import org.springframework.stereotype.Service;

import cn.com.zjf.model.Student;



@Service(value="service")
public class StudentService {

	public StudentService() {
		System.out.println("ss");
	}
	
	public void service(Student student){
		System.out.println(student);
	}
}
