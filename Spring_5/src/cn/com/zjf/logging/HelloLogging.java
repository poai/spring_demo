package cn.com.zjf.logging;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/*��IOC��������*/
@Component
/*����Ϊ����*/
@Aspect
public class HelloLogging {

	/*ǰ��֪ͨ*/
	@Before(value="execution(* *(..))")
	public void before(JoinPoint joinpoint){
		System.out.println("before,method,"+joinpoint.getSignature().getName()+",args:"+Arrays.asList(joinpoint.getArgs()));
	}
}
