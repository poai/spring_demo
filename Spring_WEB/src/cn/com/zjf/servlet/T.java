package cn.com.zjf.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import cn.com.zjf.model.Hello;

@WebServlet("/T")
public class T extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*原理:当WEB容器启动的时候实例化IOC容器-->存储到Application域中
		 * 
		 * **Spring提供了实现
		 * */
		
		
		/*3.从ServletContext中获取IOC容器*/
		//WebApplicationContext wac=(WebApplicationContext) request.getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
		WebApplicationContext wac=WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());
		Hello hello=wac.getBean("hello",Hello.class);
		hello.setMessage("hello World!!!");
		hello.hello();
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
