package in.sp.bean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		String con= "/in/sp/bean/anno.xml";
		
  ApplicationContext context=new ClassPathXmlApplicationContext(con);
  Student aa= (Student)context.getBean("abc");
  System.out.println(aa.hashCode());
  aa.dis();

  
	}
}
