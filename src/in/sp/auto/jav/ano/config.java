package in.sp.auto.jav.ano;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {
	@Bean
	public Add app() {
		Add ap=new Add("ofodshf","jdsnfi");
//		ap.setEmpname("kapil");
//		ap.setFname("kkkk");
		
		return ap;
	}
	
@Bean
	public Emp seet() {
		Emp ar=new Emp();
//		ar.setName(app());
		ar.setNo(1212);
		return ar;
	}
}
