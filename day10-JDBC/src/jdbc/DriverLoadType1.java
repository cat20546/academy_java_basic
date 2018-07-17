package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

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
public class DriverLoadType1 {
	
	private static final String URL = 
			"jdbc:oracle:thin:@//127.0.0.1:1521/XE";
	private static final String USER = "SCOTT";
	private static final String PASSWORD = "TIGER";

	public static void main(String[] args) throws SQLException {
		// 1. 드라이버 로드 : 방법 1 : 드라이버 인스턴스 생성
		new OracleDriver();	
		
		// 2. 커넥션 맺기
		Connection conn = 
				DriverManager.getConnection(URL, USER, PASSWORD);
		
		// 3. 쿼리 준비 
		String sql = "SELECT e.EMPNO"
				+ "        , e.ENAME"
				+ "     FROM emp e"
				+ "    ORDER BY e.ename";
		
		Statement stmt = conn.createStatement();
		
		// 4. 쿼리 실행
		ResultSet result = stmt.executeQuery(sql);
		
		// 5. 결과 처리 : 반복수행
		//                (DQL 실행 결과는 보통 여러 행이기 때문)
		
		// 결과 셋의 정보 
		ResultSetMetaData meta = result.getMetaData();
		String empnoCol = meta.getColumnName(1);
		String enameCol = meta.getColumnName(2);
		
		System.out.printf("%6s |%7s%n", empnoCol, enameCol);
		System.out.println("--------------");
		
		while (result.next()) {
			int empno = result.getInt("EMPNO");
			String ename = result.getString(2);
			
			System.out.printf("%6d |%7s%n", empno, ename);
		}
		
		// 6. 자원 해제
		//    순서 : 오픈한 반대 순서
		//          result => stmt => conn
		if (result != null)
			result.close();
		
		if (stmt != null)
			stmt.close();
		
		if (conn != null) 
			conn.close();

	}

}





