package school;

/**
 * 학생의 정보를 저장할 클래스
 * 사람의 공통 정보를 담는 클래스인 Person을 상속한다.
 * @author PC38206
 *
 */
public class Student extends Person implements Lesson {
	
	// 1. 멤버변수 선언부
	private String major;
	
	// 2. 생성자 선언부
	Student() { }
	
	Student(String major) {
		this.major = major;
	}
	
	Student(String id, String name, int age, String major) {
		super(id, name, age);
		// 부모 클래스의 생성자의 초기화 기능을 빌려오는
		// super() 키워드는 생성자 정의 첫줄에 1번만 가능
		this.major = major;
	}
	
	/** major 필드의 접근자 */
	public String getMajor() {
		return major;
	}

	/** major 필드의 수정자 */
	public void setMajor(String major) {
		this.major = major;
	}

	// 3. 메소드 선언부
	@Override
	public String toString() {
		String studentStr = String.format(", 전공:%s", major);
		return "학생 정보[" + super.toString() + studentStr + "]";
	}

	@Override
	public void print() {
		System.out.println("== 학생 ==");
		System.out.println(this);
	}

	@Override
	public String attend() {
		String stdStr = String.format("학생 [%s](이)가 출석하였습니다."
                                     , this.getId());
		return stdStr;
	}

	@Override
	public String lesson() {
		// 학생[아이디] 이가 전공[과목명] 수업을 듣고 있습니다.
		return String.format("학생[%s] (이)가 전공[%s] "
				           + "수업을 듣고 있습니다."
			                , this.getId(), this.getMajor());
	}

}







