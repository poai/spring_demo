package cn.com.zjf.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public abstract class PageModel<T> {
	@Autowired
	@Qualifier("student")
	protected T t;
	public abstract void page();
}
