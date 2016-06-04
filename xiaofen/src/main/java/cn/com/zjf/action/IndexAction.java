package cn.com.zjf.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import cn.com.zjf.model.Hello;
import cn.com.zjf.service.HelloService;

@Controller
public class IndexAction extends ActionSupport{

	/**
	 * 
	 */
	@Autowired
	private HelloService helloService;
	private static final long serialVersionUID = 1L;
	public String index(){
		
		Hello hello=new Hello();
		hello.setMessage("hello World!!!");
		helloService.save(hello);
		return SUCCESS;
	}

}
