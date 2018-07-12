package shop;

import java.util.List;

/**
 * 물건을 판매하는 매장을 나타내는 클래스
 * 매장에는 물건 판매를 위하여 최소 1명의
 * 매니저는 있어야 한다.
 * @author PC38206
 *
 */
public class Shop {
	
	// 1. 멤버 변수 선언부 : 매장을 관리할 매니저 최소 1명
	private Manager manager;
	
	// 2. 생성자 선언부
	// (1) 기본 생성자
	public Shop() {
		manager = new Manager();
	}
	
	// (2) 매개변수가 있는 생성자
	public Shop(Manager manager) {
		this.manager = manager;
	}
	
	// manager 필드의 접근자 / 수정자 선언
	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	// 3. 메소드 선언부
	/**
	 * 매장에 신규 제품이 들어왔을 경우
	 * 매니저에게 새 제품을 창고에 등록해달라 부탁함
	 * @param product
	 */
	public void add(Product product) {
		manager.add(product);
	}
	
	/**
	 * 매장에서 판매하는 제품 정보에 수정이 필요할 때
	 * 매니저에게 제품 정보 수정을 부탁함
	 * @param product
	 */
	public void set(Product product) {
		manager.set(product);
	}

	/**
	 * 매장에서 더 이상 판매하지 않을 물건의 폐기를
	 * 매니저에게 부탁함
	 * @param product
	 */
	public void remove(Product product) {
		manager.remove(product);
	}
	
	/**
	 * 매장에 찾아온 고객에게 판매할 물건을
	 * 창고에서 가져다 달라고 매니저에게 부탁함
	 * @param product
	 * @return
	 */
	public Product get(Product product) {
		return manager.get(product);
	}
	
	/**
	 * 매장에서 판매될 수 있는 모든 제품의 정보를
	 * 매니저에게 부탁함
	 * @return
	 */
	public List<Product> getAllProducts() {
		return manager.getAllProducts();
	}
	
}











