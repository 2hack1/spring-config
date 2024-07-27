package in.sp.stand.xml.spring;

import java.util.List;

public class Stand {

	private String name;
	private String fname;
	private List<String>papa;
	
	public List<String> getPapa() {
		return papa;
	}
	public void setPapa(List<String> papa) {
		this.papa = papa;
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
//	@Override
//	public String toString() {
//		return "Stand [name=" + name + ", fname=" + fname + ", papa=" + papa + "]";
//	}
	
	public void display() {
		System.out.println("name"+name);
		System.out.println("fname"+fname);
		System.out.println("list---"+papa);
	}
	
	
}
