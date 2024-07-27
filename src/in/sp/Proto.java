package in.sp;


//@Scope("prototype")  // yahan nahi chal raha hai
public class Proto {

	 
		private String  name;
		private int no;
	
		public String getName() {
			return name;
		}
			public void setName(String name) {
			this .name=name;	
			}
			public int getNo() {
				return no;
			}
			public void setNo(int no) {
				this.no=no;
			}
			public void dis() {
				System.out.println("name"+name);
				System.out.println("emp no."+no);
			}
}