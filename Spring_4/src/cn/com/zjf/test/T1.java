package cn.com.zjf.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.zjf.controller.StudentController;
import cn.com.zjf.model.Student;
import cn.com.zjf.model.StudentPage;
import cn.com.zjf.service.StudentService;

public class T1 {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
		Student student1 = ac.getBean("student", Student.class);
		Student student2 = ac.getBean("student", Student.class);
		System.out.println(student1);
		System.out.println(student2);
		
		
		StudentService
		studentService=ac.getBean("service",StudentService.class);
		System.out.println(studentService);
		

		
		StudentController studentController=ac.getBean("studentController",StudentController.class);
		System.out.println(studentController);
		
		
		/*测试泛型依赖注入
		 * 父类中的泛型属性的注入会在子类中完成
		 **/
		
		StudentPage studentPage=ac.getBean("studentPage",StudentPage.class);
		System.out.println("----");
		studentPage.page();
		ac.close();

	}
}
