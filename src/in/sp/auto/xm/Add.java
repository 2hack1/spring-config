package in.sp.auto.xm;

public class Add {
	
	private String namee;
	private int   fname;
	
	public int  getFname() {
		return fname;
	}
	public void setFname(int fname) {
		this.fname = fname;
	}
	public String getNamee() {
		return namee;
	}
	public void setNamee(String namee) {
		this.namee = namee;
	}
	@Override
	public String toString() {
		return "Add [fname=" + fname + ", namee=" + namee + "]";
	}
	
	

}
