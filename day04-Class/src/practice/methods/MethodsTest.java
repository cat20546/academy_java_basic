package practice.methods;

/**
 * VarietyMethods 클래스를 테스트하는 클래스
 * 
 * @author PC38206
 *
 */
public class MethodsTest {

	public static void main(String[] args) {
		// 1. 선언
		VarietyMethods methods;
		
		// 2. 초기화
		methods = new VarietyMethods();
		
		// 3. 사용
		methods.sayHello();
		methods.maxims("소크라테스", "너 자신을 알라");
		System.out.println("============================");
		
		methods.birthYearMonth("킬리앙 음바페", 1998, 12);
		System.out.println("============================");
		
		methods.printNineNineTable(8);
		System.out.println("============================");
		
		int[] stages = new int[4];
		stages[0] = 2;
		stages[1] = 8;
		stages[2] = 9;
		stages[3] = 11;
		methods.printNineNineTableArray(stages);
		System.out.println("============================");
		
		double cel = methods.fahToCel(100.0);
		System.out.printf("cel = %5.2f%n", cel);
		System.out.println("============================");
		
		String result = methods.calcBmi(172, 88);
		System.out.printf("%s%n", result);
		System.out.println("============================");
		
		int min = methods.min(100, -100);
		System.out.printf("min = %d%n", min);
		System.out.println("============================");
		
		int max = methods.max(100, -100);
		System.out.printf("max = %d%n", max);
		System.out.println("============================");
		
		int[] numbers = new int[4];
		numbers[0] = 100;
		numbers[1] = 200;
		numbers[2] = 300;
		numbers[3] = 400;
		int sum = methods.sumOfArray(numbers);
		System.out.printf("100 ~ 400 까지 원소의 합 : %4d%n"
				        , sum);
		
		
		double avg = methods.avgOfArray(numbers);
		System.out.printf("100 ~ 400 까지 원소의 평균 : %6.2f%n"
				, avg);
		
		
		methods.adder('+', 100, 90);
		methods.adder('-', 100, 90);
		
		
		
		
		
		
		
		
		
		

	}

}




