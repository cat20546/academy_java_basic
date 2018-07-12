package school;

/**
 * Person 과 상속관계인 
 * Student, Employee, Teacher 를
 * 테스트하는 클래스이다. 
 * @author PC38206
 *
 */
public class PersonTest {

	public static void main(String[] args) {

		// 1. 선언, 2. 초기화
		Person[] persons = new Person[3];
		persons[0] = new Student("S02", "홍길동", 18, "도술");
		persons[1] = new Employee("E03", "허균", 48, "문학예술지원부");
		persons[2] = new Teacher("T04", "정약용", 25, "행정");
		
		// 3. 사용
		for (Person person: persons) {
			person.print();
		}
	}

}




