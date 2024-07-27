package in.sp.auto.jav.ano;

public class Add {

	private String empname;
	private String fname;
	
////	public String getEmpname() {
////		return empname;
////	}
//	public void setEmpname(String empname) {
//		this.empname=empname;
//	}
////	public String getFname() {
////		return fname;
////	}
//	public void setFname(String fname) {
//		this.fname=fname;
//	}
	
	public Add(String empname,String fname) {
		this.empname=empname;
		this.fname=fname;
		
	}
	@Override
	public String toString() {
		return "Add [empname=" + empname + ", fname=" + fname + "]";
	}
	
}
