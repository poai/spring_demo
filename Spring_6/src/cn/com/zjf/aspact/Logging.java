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

/*指定切面的优先级,值越小优先级越高,默认值Integer.MAX_VALUE;*/
@Order(200)
public class Logging {
	/*访问修饰符 返回类型 包名.类名.方法(参数类型)
	 * 	①访问修饰符 返回类型 ,可以使用一个*来统配
	 *  ②包名.类名.方法,可以出项多个*
	 *  ③(参数类型),是用'..'统配任意类型的参数
	 * 
	 * */
	/*使用JoingPoint访问当前连接点的信息*/
	
	//重用切点表达式
	@Pointcut(value="execution(* cn.com.zjf.*.*.*(..))")
	public void pointCut(){}
	
	//1.前置通知,不能访问到结果
	@Before("pointCut()")
	public void bofore(JoinPoint joinPoint){
		/*访问参数列表*/
		joinPoint.getArgs();
		/*获取方法名称*/
		joinPoint.getSignature().getName();
		System.out.println("@Before,args:"+Arrays.asList(joinPoint.getArgs()));
	}
	//2.返回通知,可以获取到执行的结果
	
	@AfterReturning(value="pointCut()",returning="result")
	public void afterReturning(JoinPoint joinPoint,Object result){
		System.out.println("@AfterReturning,args:"+Arrays.asList(joinPoint.getArgs())+",result:"+result);
	}
	
	//3.异常通知,不能访问到结果
	@AfterThrowing(value="pointCut()",throwing="e")
	public void afterException(JoinPoint joinPoint,Exception e){
		System.out.println("@AfterThrowing,args:"+Arrays.asList(joinPoint.getArgs())+",exception:"+e.getMessage());
	}
	//4.返回通知,不能访问到结果
	@After(value = "pointCut()")
	public void after(JoinPoint joinPoint){
		System.out.println("@After,args:"+Arrays.asList(joinPoint.getArgs()));
	}
	
	/*
	@Around(value="pointCut()")
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
	*/
	
}
