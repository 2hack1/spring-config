package in.sp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		String con="/in/sp/config.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(con);
Proto aa=(Proto)context.getBean(Proto.class);
   System.out.println(aa.hashCode());
   Proto aa1=(Proto)context.getBean(Proto.class);
   System.out.println(aa1.hashCode());
	}
}
