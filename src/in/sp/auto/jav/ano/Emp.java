package in.sp.auto.jav.ano;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class Emp {
  @Autowired
	private Add  name;
	private int no;
	
//	public Add getName() {
//		return name;
//	}
		public void setName(Add name) {
		this .name=name;	
		}
//		public int getNo() {
//			return no;
//		}
		public void setNo(int no) {
			this.no=no;
		}
		public void dis() {
			System.out.println("name"+name);
			System.out.println("emp no."+no);
		}
	
}
