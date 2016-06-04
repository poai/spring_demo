package cn.com.zjf.aspact;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Repository;

@Repository
@Aspect
@Order(100)
public class Validate {

	
	@Before(value = "cn.com.zjf.aspact.Logging.pointCut()")
	public void bofore(){
		
		System.out.println("Validate_before");
	}
}
