package mybatis.emp.mapper;

import java.util.List;
import java.util.Map;

import mybatis.emp.vo.Emp;

/**
 * EmpMapper.xml 에 정의되어있는
 * 각 쿼리 아이디를 
 * 메소드로 매핑하는 인터페이스
 * @author PC38206
 *
 */
public interface EmpMapper {

	/**
	 * Emp 전체 목록 조회
	 * @return Emp 전체 목록을 Map으로 리턴
	 */
	public abstract List<Map<String, Object>> selectAll();
	
	/**
	 * 매개변수로 입력된 empno 에 해당하는 직원 한명의
	 * 모든 정보를 조회
	 * @param empno : 조회할 직원 사번
	 * @return 직원 1명의 상세 정보
	 */
	public abstract Emp selectOne(int empno);
	
	/**
	 * 직원의 정보 1건을 insert
	 * @param emp : 추가할 직원의 정보가 담긴 emp 객체
	 * @return 추가에 성공한 행의 개수
	 */
	public abstract int insert(Emp emp);
	
}








