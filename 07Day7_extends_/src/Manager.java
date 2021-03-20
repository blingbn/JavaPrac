
public class Manager extends Employee {

	String depart; //관리부서
	public Manager() {
	super();
	}
	
	public Manager(String ssn,String name,
			String address,String depart) {
		//부모에서 선언된 변수들은 부모생성자에서 초기화
		super(ssn,name,address);
		this.depart=depart;
	}
	
	
	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}
	
}
