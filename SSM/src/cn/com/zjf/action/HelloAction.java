package cn.com.zjf.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import cn.com.zjf.model.Hello;
import cn.com.zjf.service.HelloService;


@Controller
@Scope("prototype")
public class HelloAction extends ActionSupport implements RequestAware{

	private static final long serialVersionUID = 1L;
	@Autowired
	private HelloService helloService;
	private Hello hello;
	private Integer id;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String save(){
		helloService.save(hello);
		return "success";
		
	}
	public String get(){
		System.out.println(id);
		hello=helloService.get(id);
		requestMap.put("hello", hello);
		return "success";
		
	}
	

	public Hello getHello() {
		return hello;
	}

	public void setHello(Hello hello) {
		this.hello = hello;
	}
	private Map<String, Object> requestMap;
	@Override
	public void setRequest(Map<String, Object> requestMap) {
		this.requestMap=requestMap;
		
	}
}
