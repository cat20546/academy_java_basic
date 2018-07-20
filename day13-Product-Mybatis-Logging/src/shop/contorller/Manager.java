package shop.contorller;

import static shop.factory.ReplyFactory.getReply;

import java.util.List;

import shop.dao.ArrayWarehouse;
import shop.dao.GeneralWarehouse;
import shop.exception.DuplicateException;
import shop.exception.NotFoundException;
import shop.view.Reply;
import shop.vo.Product;

/**
 * 창고(Warehouse)를 사용하는
 * 매장 매니저를 나타내는 클래스
 * ------------------------------------------------
 * 매장 매니저는
 * 1. 제품을 창고에 등록하거나
 * 2. 창고에서 가지고 오거나
 * 3. 수량이나 가격정보를 수정하거나
 * 4. 더 이상 판매하지 않을 물건을 폐기 하는
 * 
 * 등의 작업을 창고에서 진행
 * -------------------------------------------------
 * 전제 조건 : 매니저는 우리 매장의 창고가 어디 있는지
 *             알고 있어야 한다.
 * -------------------------------------------------
 * @author PC38206
 *
 */
public class Manager {
	
	// 1. 멤버 변수 선언부
	// 작업할 창고에 대한 변수
	private GeneralWarehouse warehouse;
	// 작업후 응답에 대한 변수
	private Reply reply;
	
	// 2. 생성자 선언부
	// (1) 매니저 기본 생성자
	public Manager() {
		warehouse = new ArrayWarehouse();
	}
	
	// (2) 매개변수가 있는 매니저 생성자
	public Manager(GeneralWarehouse warehouse) {
		this.warehouse = warehouse;
	}
	
	// warehouse 필드의 접근자 / 수정자 
	public GeneralWarehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(GeneralWarehouse warehouse) {
		this.warehouse = warehouse;
	}

	// 3. 메소드 선언부
	/**
	 * 매니저는 제품 한개를 창고로 들고가서
	 * 창고에 등록을 할 수 있다
	 * @param product
	 */
	public void add(Product product) {
		String message = null;
		
		try {
			warehouse.add(product);
			
			message = String.format("제품 정보[%s]추가에 성공하였습니다."
					, product.getProdCode());
			
			reply = getReply("message");
				
		} catch (DuplicateException e) {
			message = String.format("제품 정보[%s]추가에 실패하였습니다."
					, product.getProdCode());
			
			reply = getReply("error");
			e.printStackTrace();
			
		} finally {
			// 제품 추가시 예외가 발생 해도, 안해도
			// 제품 추가에 대한 메시지가 출력되어야 하므로
			// finally 블록에 작성
			reply.reply(message);
		}
		
	}
	
	/**
	 * 매니저는 제품 한개를 창고로 들고가서
	 * 창고에 있던 제품 정보를 수정할 수 있다.
	 * @param product
	 */
	public void set(Product product) {
		String message = null;
		
		try {
			warehouse.set(product);
			
			message = String.format("제품 정보[%s]수정에 성공하였습니다."
					, product.getProdCode());
			
			reply = getReply("message");
			
		} catch (NotFoundException e) {
			message = String.format("제품 정보[%s]수정에 실패하였습니다."
					, product.getProdCode());
			
			reply = getReply("error");
			e.printStackTrace();
			
		} finally {
			reply.reply(message);
		}
		
	}
	
	/**
	 * 매니저는 창고에 가서 더 이상 팔지 않아 폐기할
	 * 제품 정보를 제거할 수 있다.
	 * 이 때, 제거할 제품의 정보는 알고 있어야 한다.
	 * @param product
	 */
	public void remove(Product product) {
		String message = null;
		
		try {
			warehouse.remove(product);
			
			message = String.format("제품 정보[%s]삭제에 성공하였습니다."
					, product.getProdCode());
			
			reply = getReply("message");
			
		} catch (NotFoundException e) {
			message = String.format("제품 정보[%s]삭제에 실패하였습니다."
					, product.getProdCode());
			
			reply = getReply("error");
			
		} finally {
			reply.reply(message);
		}
		
	}
	
	/**
	 * 매니저는 창고에 가서 요청된 제품 한개를
	 * 가지고 올 수 있다.
	 * @param product
	 * @return
	 */
	public void get(Product product) {
		Product found;
		
		try {
			found = warehouse.get(product);
			
			reply = getReply("single");
			reply.reply(found);
			
		} catch (NotFoundException e) {
			reply = getReply("error");
			
			reply.reply("찾는 제품["
					+ product.getProdCode()
					+"]이(가) 존재하지 않습니다.");
			e.printStackTrace();
		}
	}
	
	/**
	 * 매니저는 현재 창고에 등록되어 남아있는 
	 * 제품 정보 전체 목록을 조회할 수 있다
	 * @return
	 */
	public void getAllProducts() {
		List<Product> products = warehouse.getAllProducts();
		reply = getReply("list");
		reply.reply(products);
	}
	
}







