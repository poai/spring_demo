package cn.com.zjf.model;

import org.springframework.stereotype.Component;

@Component("studentPage")
public class StudentPage extends PageModel<Student>{
	@Override
	public void page() {
		System.out.println(this.t);
	}
}
