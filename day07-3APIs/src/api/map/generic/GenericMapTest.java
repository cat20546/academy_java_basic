package api.map.generic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import api.object.Product;

public class GenericMapTest {

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
		
		// 1. 선언 : Key : String, Value : Product 로
		//           Generic 을 적용한 Map 으로 선언
		Map<String, Product> products;
		
		// 2. 초기화 : Key : String, Value : Product 로
		//           Generic 을 적용한 HashMap 으로 초기화
		products = new HashMap<String, Product>();
		
		
		// 3. 사용
		// (1) Key : prodCode 를 추출하여 입력
		//   Value : 제품 객체 자체
		products.put(adidas.getProdCode(), adidas);
		products.put(reebok.getProdCode(), reebok);
		products.put(nike.getProdCode(), nike);
		products.put(crocs.getProdCode(), crocs);
		products.put(birkenstock.getProdCode(), birkenstock);
		
		// (2) map 에서 Product 객체 하나 추출
		Product product = products.get("S004");
		product.print();
		
		// (3) foreach 로 출력 : key 먼저 얻은 후 전체 출력
		Set<String> productKeys = products.keySet();
		
		for (String key: productKeys) {
			Product prod = products.get(key);
			prod.buy(30);
			prod.print();
		}

	}

}







