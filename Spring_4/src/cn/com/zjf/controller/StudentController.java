package cn.com.zjf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import cn.com.zjf.service.StudentService;

@Controller
public class StudentController {
	
	
	
	
	private StudentService studentService;

	
	public StudentService getStudentService() {
		return studentService;
	}

	@Autowired(required=false)

	public void setStudentService(@Qualifier("service")StudentService studentService) {
		this.studentService = studentService;
	}

	@Override
	public String toString() {
		return "StudentController [studentService=" + studentService + "]";
	}
	
	
}
