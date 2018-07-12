package api.wrapper;

import static java.lang.Integer.*;
import static java.lang.Double.*;
/**
 * 기본형을 객체형으로 포장하는 포장클래스중
 * int    : Integer
 * double : Double
 * 두 가지를 테스트하는 클래스이다.
 * @author PC38206
 *
 */
public class IntDoubleWrapper {

	public static void main(String[] args) {
		// (0) 사용할 문자열 변수 선언
		String intInput = "100";
		String dblInput = "200.0";

		// (1) String ----> 기본형
		// (.1) parseType() : static 메소드 사용하는 방법
		String intFrm = String.format("문자열[%s] 를 기본형[%d] 로 변경"
				              , intInput, Integer.parseInt(intInput));
		System.out.println(intFrm);
		
		String dblFrm = String.format("문자열[%s] 를 기본형[%f] 로 변경"
				              , dblInput, Double.parseDouble(dblInput));
		System.out.println(dblFrm);
		
		// static import 를 진행하면 클래스이름을 생략==========
		intFrm = String.format("문자열[%s] 를 기본형[%d] 로 변경"
							, intInput, parseInt(intInput));
		System.out.println(intFrm);
		
		dblFrm = String.format("문자열[%s] 를 기본형[%f] 로 변경"
							, dblInput, parseDouble(dblInput));
		System.out.println(dblFrm);
		// =====================================================
		
		// (.2) typeValue() : non-static 메소드 사용 
		intFrm = String.format("문자열[%s] 를 기본형[%d] 로 변경"
				, intInput, new Integer(intInput).intValue());
		System.out.println(intFrm);
		
		dblFrm = String.format("문자열[%s] 를 기본형[%f] 로 변경"
				, dblInput, new Double(dblInput).doubleValue());
		System.out.println(dblFrm);
		
		
		// (2) 기본형 ----> String
		int ten = 10;
		double sixty = 60.0;
		
		String tenStr = new Integer(ten).toString();
		String sixtyStr = new Double(sixty).toString();
		
		// String 변경 확인을 위해 문자열 접합
		tenStr += "입니다.";
		sixtyStr += "입니다.";
		
		// 접합 연산 결과 출력
		System.out.println(tenStr);
		System.out.println(sixtyStr);
		
		
		// (3) 기본형 <-----> 객체형
		Integer objTen = new Integer(ten);
		Double objSixty = new Double(sixty);
		
		System.out.println(ten + "의 객체 형 데이터:" + objTen);
		System.out.println(sixty + "의 객체 형 데이터:" + objSixty);
	}

}







