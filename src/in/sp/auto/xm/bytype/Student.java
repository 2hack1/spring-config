package in.sp.auto.xm.bytype;

public class Student {
	private int roll;
	private Add name;
	private String email;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public Add getName() {
		return name;
	}
	public void setName(Add name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
public void display() {
	System.out.println("name 🤣🤣"+name);
	System.out.println("email😊😊"+email);
	System.out.println("roll no😂😂"+roll);
}

}
