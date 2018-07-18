package shop.test.junit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

import shop.dao.GeneralWarehouse;
import shop.exception.DuplicateException;
import shop.exception.NotFoundException;
import shop.factory.WarehouseFactory;
import shop.vo.Product;

/**
 * JdbcWarehouse 클래스를 작성하며
 * 하나의 메소드를 만들때마다 각 메소드를 유닛 테스트 진행하도록
 * 테스트 케이스를 만드는 JUnit 테스트 클래스
 * @author PC38206
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class JdbcWarehouseJunitTest {
	
	// 테스트에 사용할 Product 객체 참조 변수들 선언
	private Product adidas;
	private Product reebok;
	private Product nike;
	private Product crocs;
	private Product birkenstock;
	
	// 테스트에 사용할 JdbcWarehouse 객체 참조할 변수
	GeneralWarehouse warehouse;
	

	// 테스트 클래스 실행시 최초 한번만 실행되는 메소드
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		// jdbc 의 경우 드라이버 로드 작업등 딱 한번만 
		// 실행하면 되는 작업을 여기서 진행
	}

	// 테스트 클래스 실행 종료 전 한번 실행되는 메소드
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	// 각각의 @Test 메소드 실행 전 항상 1번씩 실행
	@BeforeEach
	void setUp() throws Exception {
		adidas = new Product("S001", "슈퍼스타", 87200, 5);          
		reebok = new Product("S002", "리복 로얄 테크큐 티", 42000, 20);  
		nike = new Product("S003", "나이키 탄준 샌들", 41300, 30);      
		crocs = new Product("S004", "라이트라이드 샌들 우먼", 40200, 7);   
		birkenstock = new Product("S005", "지제 에바", 29000, 15);
		
		warehouse = WarehouseFactory.getWarehouse("jdbc");
	}

	// 각각의 @Test 메소드 실행 후 항상 1번씩 실행
	@AfterEach
	void tearDown() throws Exception {
	}

	// 1.1 데이터 입력 
	@Test
	void test1AddProduct() throws DuplicateException, NotFoundException {
		// (1) 아디다스 제품 입력
		warehouse.add(adidas);
		
		// (2) 입력된 아디다스 제품 조회
		Product send = new Product("S001");
		Product searched = warehouse.get(send);
		
		// (3) 입력에 사용된 adidas 내용과 조회된 결과 searched 가
		//     동일할 것으로 가정하고 assert 를 사용
		
		// 조회 객체와 입력 객체 코드값 비교
		assertThat("테스트 실패(prodCode)", searched.getProdCode(), is(adidas.getProdCode()));
		assertThat("테스트 실패(prodName)", searched.getProdName(), is(adidas.getProdName()));
		assertThat("테스트 실패(price)", searched.getPrice(), is(adidas.getPrice()));
		assertThat("테스트 실패(quantity)", searched.getQuantity(), is(adidas.getQuantity()));
		
	}
	
	// 1.2 동일 제품을 1번 더 입력 시도
	@Test
	void test2AddProduct() throws DuplicateException {
//		warehouse.add(adidas);
		assertThrows(DuplicateException.class
				  , () -> {warehouse.add(adidas);});
	}
	
	
	// 2. 전체 목록 조회
	@Test
	void test3GetAllProducts() throws DuplicateException {
		// 나머지 제품 입력
		warehouse.add(birkenstock);
		warehouse.add(crocs);
		warehouse.add(nike);
		warehouse.add(reebok);
		
		// 전체 조회
		List<Product> products = warehouse.getAllProducts();
		
		// 검증방법 1 : 데이터 건수가 예상하는 5건이 맞는가?
		assertThat("실패: 데이터 건수가 맞지 않음", products.size(), is(5));
		
		
	}
	
	// 3. 1건 수정
	@Test
	void test4SetProduct() throws NotFoundException {	
		// 수정할 제품 정보 
		Product adidas2 = new Product("S001", "슈퍼스타", 75000, 5);
		
		int setCnt = warehouse.set(adidas2);
		
		// 수정 후 수정 행의 갯수가 1일 것으로 예상
		assertThat("수정 행의 갯수가 1이 아님", setCnt, is(1));
		
		// 4. 수정 데이터 1건 확인
		// 수정 후 데이터를 조회를 통해 확인
		Product send = new Product("S001");
		Product searched = warehouse.get(send);
		// S001 로 조회한 데이터의 각 필드가 adidas2 랑 일치할 것을 예상
		assertThat("데이터 불일치(prodCode)"
				, searched.getProdCode(), is(adidas2.getProdCode()));
		assertThat("데이터 불일치(prodName)"
				, searched.getProdName(), is(adidas2.getProdName()));
		assertThat("데이터 불일치(price)"
				, searched.getPrice(), is(adidas2.getPrice()));
		assertThat("데이터 불일치(quantity)"
				, searched.getQuantity(), is(adidas2.getQuantity()));
	}
	
	// 5. 1건 삭제
	@Test
	void test5RemoveProduct() throws NotFoundException {
		// 삭제할 제품 코드만 가지는 객체 신규 생성
		Product rmProd = new Product("S001");
		
		// 삭제 진행
		int rmCnt = warehouse.remove(rmProd);
		
		// rmCnt 가 1건이 발생했을 것을 예상
		assertThat("실패 삭제 건수가 1이 아님", rmCnt, is(1));
	}
	
	// 6. 없는 코드 제품 수정
	@Test //(expected = NotFoundException.class)
	void test6SetProduct() throws NotFoundException {
		// 없는 코드 제품 정보 생성
		Product p007 = new Product("P007");
		
		// 수정 시도		
		assertThrows(NotFoundException.class
				   , () -> {warehouse.set(p007);});
	}
	
	// 7. 없는 코드 제품 조회
	@Test //(expected = NotFoundException.class)
	void test7GetProduct() throws NotFoundException {
		Product p007 = new Product("P007");
		
		assertThrows(NotFoundException.class
				   , () -> {warehouse.set(p007);});
	}
	
	// 8. 없는 코드 제품 삭제
	@Test //(expected = NotFoundException.class)
	void test8RemoveProduct() {
		Product p007 = new Product("P007");
		
		assertThrows(NotFoundException.class
				   , () -> {warehouse.remove(p007);});
		
	}
	
	// 9. 남은 4건 삭제
	@Test
	void test9RemoveProducts() throws NotFoundException {
		int rmCnt = 0;
		
		rmCnt = warehouse.remove(birkenstock);
		assertThat("실패 : 삭제 건수가 1이 아님", rmCnt, is(1));
		
		rmCnt = warehouse.remove(crocs);
		assertThat("실패 : 삭제 건수가 1이 아님", rmCnt, is(1));

		rmCnt = warehouse.remove(reebok);
		assertThat("실패 : 삭제 건수가 1이 아님", rmCnt, is(1));
		
		rmCnt = warehouse.remove(nike);
		assertThat("실패 : 삭제 건수가 1이 아님", rmCnt, is(1));
		
		
	}

}







