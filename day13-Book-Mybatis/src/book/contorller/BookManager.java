package book.contorller;

import static book.factory.BookViewFactory.getBookView;

import book.dao.BookShelf;
import book.exception.DuplicateException;
import book.exception.NotFoundException;
import book.view.BookView;
import book.vo.Book;

/**
 * 서점에서 책을 관리하는 매니저를 구현하는 클래스
 * @author PC38206
 *
 */
public class BookManager {
	
	// 1. 멤버 변수 선언
	/** 서점에서 책을 꼽아두는 책장 */
	private BookShelf books;
	
	/** 매니저의 출력 양식 */
	private BookView view;

	// 2. 생성자 선언
	public BookManager() { }

	public BookManager(BookShelf books) {
		this.books = books;
	}
	
	// 3. 메소드 선언
	public void insert(Book book) {
		String message = "";
		
		try {
			books.insert(book);
			message = String.format("[추가]:책[%s:%s] 정보 추가 성공"
					               , book.getBookId(), book.getTitle());			
			view = getBookView("message");
			
		} catch (DuplicateException e) {
			message = e.getMessage();
			view = getBookView("error");
		}
		
		view.display(message);
	}
	
	public void update(Book book) {
		String message = "";
		
		try {
			books.update(book);
			message = String.format("[수정]:책[%s:%s] 정보 수정 성공"
					, book.getBookId(), book.getTitle());			
			view = getBookView("message");
			
		} catch (NotFoundException e) {
			message = e.getMessage();
			view = getBookView("error");
		}
		
		view.display(message);
	}
	
	public void delete(Book book) {
		String message = "";
		
		try {
			books.delete(book);
			message = String.format("[삭제]:책[%s:%s] 정보 삭제 성공"
					, book.getBookId(), book.getTitle());			
			view = getBookView("message");
			
		} catch (NotFoundException e) {
			message = e.getMessage();
			view = getBookView("error");
		}
		
		view.display(message);
	}
	
	public void select(Book book) {		
		try {
			view = getBookView("single");
			view.display(books.select(book));
			
		} catch (NotFoundException e) {
			view = getBookView("error");
			view.display(e.getMessage());
		}
	}
	
	public void select() {
		view = getBookView("list");
		view.display(books.select());
	}

	public void select(int low, int high) {
		view = getBookView("list");
		view.display(books.select(low, high));
	}
	
	public void select(String keyword) {
		view = getBookView("list");
		view.display(books.select(keyword));
	}
	
	public void totalCount() {
		view = getBookView("message");
		view.display("등록된 전체 책 개수:" + books.totalCount());
	}

}
