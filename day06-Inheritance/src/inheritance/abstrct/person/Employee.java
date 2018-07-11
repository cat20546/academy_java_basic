package inheritance.abstrct.person;

public class Employee extends Person {

	// 1. 멤버 변수
	String dept;
	
	// 2. 생성자
	Employee() {
		
	}
	
	Employee(String id, String name, int age, String dept) {
		super(id, name, age);
		this.dept = dept;
	}

	// 3. 메소드
	@Override
	public String toString() {
		String empStr = String.format(", 부서:%s", this.dept);
		return "직원 정보[" + super.toString() + empStr + "]";
	}

	@Override
	public void print() {
		System.out.println("== 직원 ==");
		System.out.println(this);
	}
	
	
}







