package api.collection.generic;

import java.util.HashSet;
import java.util.Set;

import api.object.Product;

public class GenericSetTest {

	public static void main(String[] args) {
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
		
		// 1. 선언 : Product 만 저장하는 Set 으로 선언
		Set<Product> products;
		
		// 2. 초기화 : Product 만 저장하는 HashSet 으로 초기화
		products = new HashSet<Product>();
		
		// 3. 사용
		// (1) set 에 아이템 추가
		products.add(adidas);
		products.add(reebok);
		products.add(nike);
		products.add(crocs);
		products.add(birkenstock);
		
		// (2) set 출력
		for (Product prod: products) {
			prod.buy(50);
			prod.print();
		}

	}

}




