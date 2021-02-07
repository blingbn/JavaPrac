
class Employee {
	public void taxRate(Employee e) {
		if (e instanceof Manager) {
			Manager m = (Manager) e;
			System.out.println("Manager 세금구하기");
		} else if (e instanceof Engineer) {
			Engineer en = (Engineer) e;
			System.out.println("Engineer 세금구하기");
		} else {
			System.out.println("Employee 세금구하기");
		}
	}

}

class Manager extends Employee {}

class Engineer extends Employee {}

public class Ex06 {
	public static void main(String[] args) {
		
		
		Employee emp = new Employee();
		Manager man = new Manager();
		Engineer eng = new Engineer();
		
		emp.taxRate(emp);
		man.taxRate(man);
		eng.taxRate(eng);
		
	}

}
