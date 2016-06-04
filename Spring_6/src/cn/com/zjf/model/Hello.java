package cn.com.zjf.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope("prototype")
public class Hello {
	public Integer add(int a,int b){
		System.out.println("add");
		return a/b;
	}
}
