
public class Student {
	String name;
	int age;
	String addr;
	public String getData() {
//		return this.name+"\t"+this.age+"\t"+this.addr;
		return this.getName()+ "\t"+ this.getAge()+"\t"+getAddr();
	}
	//생성자, set,get메소드 만들기 
	public Student(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
