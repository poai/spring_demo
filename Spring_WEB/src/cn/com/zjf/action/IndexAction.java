package cn.com.zjf.action;

import javax.servlet.ServletContext;

import org.apache.struts2.util.ServletContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionSupport;

import cn.com.zjf.model.Hello;

@Controller
@Scope("prototype")
public class IndexAction extends ActionSupport implements ServletContextAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public String execute() throws Exception {

		WebApplicationContext wac=WebApplicationContextUtils.getWebApplicationContext(servletContext);
		Hello hello=wac.getBean("hello",Hello.class);
		hello.setMessage("ÄãºÃ,ÊÀ½ç");
		hello.hello();
		return SUCCESS;
	}
	private ServletContext servletContext;
	@Override
	public void setServletContext(ServletContext servletContext) {
		this.servletContext=servletContext;
	}

}
