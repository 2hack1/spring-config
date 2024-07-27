package in.sp.stand.xml.spring;

import javax.management.InvalidApplicationException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		String con= "/in/sp/stand/xml/spring/config.xml";
		
  ApplicationContext context=new ClassPathXmlApplicationContext(con);
  Stand aa= (Stand)context.getBean(Stand.class);
  aa.display();
	}
}
