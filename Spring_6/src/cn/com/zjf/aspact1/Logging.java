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
		//����Ŀ�귽��
		try {
			System.out.println("ǰ��֪ͨ");
			obj=pjp.proceed();
			System.out.println("����֪ͨ");
		} catch (Throwable e) {
			System.out.println("�쳣֪ͨ");
			e.printStackTrace();
		}finally{
			System.out.println("����֪ͨ");
		}
		return obj;
	}
	
	
}
