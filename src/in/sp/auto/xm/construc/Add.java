package in.sp.auto.xm.construc;

public class Add {
	
	private String namee;
	private int   fname;
	
//	public int  getFname() {
//		return fname;
//	}
//	public void setFname(int fname) {
//		this.fname = fname;
//	}
//	public String getNamee() {
//		return namee;
//	}
//	public void setNamee(String namee) {
//		this.namee = namee;
//	}
	
	public Add(String namee, int fname) {
		this.namee = namee;
		this.fname = fname;
	}
	@Override
	public String toString() {
		return "Add [fname=" + fname + ", namee=" + namee + "]";
	}

	
	

}
