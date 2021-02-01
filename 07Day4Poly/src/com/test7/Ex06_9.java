package com.test7;




class Person{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}//ends Person

public class Ex06_9 {

	public static void main(String[] args) {
		Person p = new Person("홍길동", 44);
		Person p2 = new Person("홍길동", 44);
		System.out.println(p); // p.toString;
		System.out.println(p2); // p2.toString;
		if(p.equals(p2)) {
			System.out.println("P와 P2가 같다.");
		}else {
			System.out.println("P와 P2가 같지않다.");
		}
	}

}
