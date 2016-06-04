package cn.com.zjf.aspact;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;




@Component
@Aspect

/*ָ����������ȼ�,ֵԽС���ȼ�Խ��,Ĭ��ֵInteger.MAX_VALUE;*/
@Order(200)
public class Logging {
	/*�������η� �������� ����.����.����(��������)
	 * 	�ٷ������η� �������� ,����ʹ��һ��*��ͳ��
	 *  �ڰ���.����.����,���Գ�����*
	 *  ��(��������),����'..'ͳ���������͵Ĳ���
	 * 
	 * */
	/*ʹ��JoingPoint���ʵ�ǰ���ӵ����Ϣ*/
	
	//�����е���ʽ
	@Pointcut(value="execution(* cn.com.zjf.*.*.*(..))")
	public void pointCut(){}
	
	//1.ǰ��֪ͨ,���ܷ��ʵ����
	@Before("pointCut()")
	public void bofore(JoinPoint joinPoint){
		/*���ʲ����б�*/
		joinPoint.getArgs();
		/*��ȡ��������*/
		joinPoint.getSignature().getName();
		System.out.println("@Before,args:"+Arrays.asList(joinPoint.getArgs()));
	}
	//2.����֪ͨ,���Ի�ȡ��ִ�еĽ��
	
	@AfterReturning(value="pointCut()",returning="result")
	public void afterReturning(JoinPoint joinPoint,Object result){
		System.out.println("@AfterReturning,args:"+Arrays.asList(joinPoint.getArgs())+",result:"+result);
	}
	
	//3.�쳣֪ͨ,���ܷ��ʵ����
	@AfterThrowing(value="pointCut()",throwing="e")
	public void afterException(JoinPoint joinPoint,Exception e){
		System.out.println("@AfterThrowing,args:"+Arrays.asList(joinPoint.getArgs())+",exception:"+e.getMessage());
	}
	//4.����֪ͨ,���ܷ��ʵ����
	@After(value = "pointCut()")
	public void after(JoinPoint joinPoint){
		System.out.println("@After,args:"+Arrays.asList(joinPoint.getArgs()));
	}
	
	/*
	@Around(value="pointCut()")
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
	*/
	
}
