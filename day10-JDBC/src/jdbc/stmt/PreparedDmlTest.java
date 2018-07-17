package jdbc.stmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * SCOTT 계정의 EMP 테이블의 내용을 조회하여
 * 데이터베이스 접속을 테스트하는 클래스
 * --------------------------------------------
 * 1. 드라이버 로드
 * 2. 커넥션 맺기
 * 3. 쿼리 준비 
 * 4. 쿼리 실행
 * 5. 결과 처리
 * 6. 자원 해제
 * --------------------------------------------
 * @author PC38206
 *
 */
public class PreparedDmlTest {
	
	private static final String URL = 
			"jdbc:oracle:thin:@//127.0.0.1:1521/XE";
	private static final String USER = "SCOTT";
	private static final String PASSWORD = "TIGER";
	
	private static final String DRIVER = "oracle.jdbc.OracleDriver";

	public static void main(String[] args)
			throws SQLException, ClassNotFoundException {
		// 1. 드라이버 로드 : 방법 5 : 클래스를 바로 메모리에 로드
		Class.forName(DRIVER);	
		
		// 2. 커넥션 맺기
		Connection conn = 
				DriverManager.getConnection(URL, USER, PASSWORD);
		
		// 3. 쿼리 준비 : empno 의 값을 변경해가며 1명의 정보를 조회
		Scanner scan = new Scanner(System.in);

		System.out.println("추가할 직원의 사번을 숫자 4자로 입력");
		int eno = scan.nextInt();
		
		System.out.println("추가할 직원의 이름을 입력");
		String ename = scan.nextLine();
		
		String sql = "INSERT INTO emp (EMPNO, ENAME) "
				+ "   VALUES (?, ?)";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		// 4. 쿼리 실행
		// (1) prepared statement 는 execute 전에 
		//     ? 에 해당하는 위치에
		//     각각의 값들을 매핑하는 단계가 추가됨
		pstmt.setInt(1, eno);
		pstmt.setString(2, ename);
		
		// (2) ?가 매핑된 pstmt 객체를 통하여 쿼리 실행
		int insertCnt = pstmt.executeUpdate();
		
		// 5. DML 결과 처리 : insertCnt 를 통해서 몇 행이 작업되었는지
		//                    정도의 정보만 확인 가능
		if (insertCnt > 0) {
			System.out.println(insertCnt + "행이 입력되었습니다.");
		}
		
		// 6. DML 자원 해제 : ResultSet 발생하지 않음 
		//    순서 : 오픈한 반대 순서
		//           pstmt => conn
		if (pstmt != null)
			pstmt.close();
		
		if (conn != null) 
			conn.close();

	}

}





