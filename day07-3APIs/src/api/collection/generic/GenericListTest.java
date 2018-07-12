package api.collection.generic;

import java.util.ArrayList;
import java.util.List;

import api.object.Product;

public class GenericListTest {

	public static void main(String[] args) {
		// 리스트에 추가할 Product 객체 생성 코드 (복사)
		Product adidas = 
				new Product("S001", "슈퍼스타", 87200, 5);
		Product reebok = 
				new Product("S002", "리복 로얄 테크큐 티", 42000, 20);
		Product nike = 
				new Product("S003", "나이키 탄준 샌들", 41300, 30);
		Product crocs = 
				new Product("S004", "라이트라이드 샌들 우먼", 40200, 7);
		Product birkenstock = 
				new Product("S005", "지제 에바", 29000, 15);
		
		
		
		// 1. 선언 : Product 만 저장하는 List 로 선언
		List<Product> products;
		
		// 2. 초기화 : Product 만 저장하는 ArrayList 로 초기화
		products = new ArrayList<Product>();
		
		// 3. 사용
		// (1) 리스트에 아이템 추가 add();
		// <Product> Generic 사용때문에 String 타입 추가 불가능
//		products.add("1st Item"); 
		products.add(adidas);
		products.add(reebok);
		products.add(nike);
		products.add(crocs);
		products.add(birkenstock);
		
		// (2) 아이템을 추출할 때 바로 Generic 적용 타입으로
		//     꺼낼 수 있다.
		Product product = products.get(0);
		product.print();
		
		// (3) 전체 목록 출력
		for (Product prod: products) {
			prod.buy(100);
			prod.print();
		}
	}

}





