package book.test.junit;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import book.dao.MybatisBookShelf;
import book.exception.DuplicateException;
import book.exception.NotFoundException;
import book.vo.Book;

public class MybatisBookShelfJunitTest {

	private static MybatisBookShelf shelf;
	private Book book1;
	private Book book2;
	private Book book3;
	private Book book4;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		shelf = new MybatisBookShelf();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		book1 = new Book("B001", "어린왕자", "앙투안 드 생택쥐페리", 8820, "9788932917245", "열린책들");
		book2 = new Book("B002", "달리기를 말할 때 내가 하고 싶은 이야기", "무라카미 하루키", 13000, "9788970128337", "문학사상");
		book3 = new Book("B003", "자바 프로젝트 필수 유틸리티", "쇼다 츠야노 , 전민수", 31500, "9791162240700", "한빛미디어");
		book4 = new Book("B004", "Do it! 자바 프로그래밍 입문", "박은종", 8820, "9788932917245", "이지스퍼블리싱");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() throws DuplicateException, NotFoundException {
		// 전체 삭제
		assertThat("not insert one", shelf.delete(book1), is(1));
		assertThat("not insert one", shelf.delete(book2), is(1));
		assertThat("not insert one", shelf.delete(book3), is(1));
		assertThat("not insert one", shelf.delete(book4), is(1));

		// 한건씩 인서트 후 리턴값 1인지 테스트
		assertThat("not insert one", shelf.insert(book1), is(1));
		assertThat("not insert one", shelf.insert(book2), is(1));
		assertThat("not insert one", shelf.insert(book3), is(1));
		assertThat("not insert one", shelf.insert(book4), is(1));
	}
	
	@Test
	public void test2() throws DuplicateException, NotFoundException {
		// bookId 만 B001 로 설정한 신규 객체로 조회한 내용과 book1 객체로 조회한 내용이 같은지 테스트
		Book getBook = new Book("B001");
		assertThat("not the same object", shelf.select(getBook), is(shelf.select(book1)));
	}

	@Test
	public void test3() {
		// 전체 목록 조회 후 목록 size() 와 totalCount() 로 얻은 값이 같은지 테스트
		assertThat("not the same size", shelf.select().size(), is(shelf.totalCount()));
		// 전체 목록 조회 후 목록 size()가 4일 것으로 예상 테스트
		assertThat("not the same size", shelf.select().size(), is(4));
	}
	
	@Test
	public void test4() {
		// 검색어 자바 결과가 2건 일 것 예상 테스트
		assertThat("not the same size", shelf.select("자바").size(), is(2));
	}
	
	@Test
	public void test5() {
		// 가격 검색 결과 8000 ~ 10000 사이가 2권 일 것 예상
		assertThat("not the same size", shelf.select(8000, 10000).size(), is(2));
	}
	
	@Test
	public void test6() throws NotFoundException {
		// B001 책에 가격만 다운 가격 설정
		Book book = new Book("B001");
		book.setPrice(3000);
		shelf.update(book);
		
		// 신규 코드만 가진 객체로 조회 
		Book newBook = new Book("B001");
		
		// 조회 결과 두 객체로 조회한 가격이 같을 것 
		assertThat("not exact price", shelf.select(newBook).getPrice(), is(shelf.select(book).getPrice()));
		// 그 가격은 3000원 일 것
		assertThat("not exact price", shelf.select(newBook).getPrice(), is(3000));
		// 책의 제목은 변화없이 어린왕자 일 것
		assertThat("not exact price", shelf.select(newBook).getTitle(), is("어린왕자"));
	}
}
