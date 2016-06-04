package cn.com.zjf.logging;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/*被IOC容器管理*/
@Component
/*申明为切面*/
@Aspect
public class HelloLogging {

	/*前置通知*/
	@Before(value="execution(* *(..))")
	public void before(JoinPoint joinpoint){
		System.out.println("before,method,"+joinpoint.getSignature().getName()+",args:"+Arrays.asList(joinpoint.getArgs()));
	}
}
