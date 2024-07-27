package in.sp.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope("prototype")
@Component("abc")
public class Student {
	@Value("#{ 1213+1212}")
	private String name;
	@Value("#{ 121+212*232/231}")
	private String fname;
//	private List<String>papa;
	@Value("#{T (java.lang.Math).sqrt(9)  }")
	private double g;
	@Value("#{T   (java.lang.Math).E  }")
	private double f;
//	public List<String> getPapa() {
//		return papa;
//	}
//	public void setPapa(List<String> papa) {
//		this.papa = papa;
//	}
	public double getf() {
		return f;
	}
	public void setf(double f) {
		this.f=f;
	}
	public double getg() {
		return g;
	}
	public void setg(double g) {
		this.g=g;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getFname() {
		return fname;
	}
	public void  setFname(String fname) {
		this.fname=fname;
	}
public void dis() {
	System.out.println(name);
	System.out.println(fname);
	System.out.println("squre root"+g);
	System.out.println("squre root"+f);
	
}
}
