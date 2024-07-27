package in.sp.auto.xm.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		String con="/in/sp/auto/xm/bytype/config.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(con);
Student aa=(Student)context.getBean(Student.class);
aa.display();
	}
}
