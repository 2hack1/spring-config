package in.sp.auto.jav.ano;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.auto.xm.Student;

public class Main {

	
	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
		Emp aa= (Emp)context.getBean(Emp.class);
		System.out.println(aa.hashCode());		Emp aa11= (Emp)context.getBean(Emp.class);
		System.out.println(aa11.hashCode());
	}
}
