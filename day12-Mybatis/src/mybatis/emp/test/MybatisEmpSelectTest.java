package mybatis.emp.test;

import static mybatis.emp.client.MybatisClient.getFactory;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * 
 * @author PC38206
 *
 */
public class MybatisEmpSelectTest {

	public static void main(String[] args) {

		// 0. sqlSession Factory 생성
		SqlSessionFactory factory = getFactory();
		
		// 1. sqlSession 얻기
		SqlSession session = factory.openSession();
		
		try {
			// 2. 세션 객체를 통해서 쿼리 실행
			List<Map<String, Object>> emps = 
					session.selectList("mybatis.emp.mapper.EmpMapper.selectAll");
			
			for (Map<String, Object> emp : emps) {
				System.out.println(emp);
			}
			
		} finally {
			// 3. sqlSession 닫기
			session.close();
		}
		
	}

}
