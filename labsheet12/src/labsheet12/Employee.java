package labsheet12;

public class Employee {
	private String dept;
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDept() {
		return this.dept =dept;
	}
	public void header() {
		for(int i=1;i<80;i++) {
			System.out.print("*");
		}
	}

}