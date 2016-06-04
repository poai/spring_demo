package cn.com.zjf.aspact1;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;





public class Logging {
	

	public void bofore(JoinPoint joinPoint){
		joinPoint.getArgs();
		joinPoint.getSignature().getName();
		System.out.println("@Before,args:"+Arrays.asList(joinPoint.getArgs()));
	}
	public void afterReturning(JoinPoint joinPoint,Object result){
		System.out.println("@AfterReturning,args:"+Arrays.asList(joinPoint.getArgs())+",result:"+result);
	}
	public void afterException(JoinPoint joinPoint,Exception e){
		System.out.println("@AfterThrowing,args:"+Arrays.asList(joinPoint.getArgs())+",exception:"+e.getMessage());
	}
	public void after(JoinPoint joinPoint){
		System.out.println("@After,args:"+Arrays.asList(joinPoint.getArgs()));
	}
	
	
	public Object around(ProceedingJoinPoint pjp){
		Object obj=null;
		//调用目标方法
		try {
			System.out.println("前置通知");
			obj=pjp.proceed();
			System.out.println("返回通知");
		} catch (Throwable e) {
			System.out.println("异常通知");
			e.printStackTrace();
		}finally{
			System.out.println("后置通知");
		}
		return obj;
	}
	
	
}
