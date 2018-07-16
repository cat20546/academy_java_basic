package io.object;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


/**
 * Product 객체를 생성하고 객체 단위 출력을 하여
 * adidas.obj 파일을 생성
 * --------------------------------------------------
 * -- 입력 --
 * 1. Product 객체 생성
 * 
 * -- 출력 --
 * 2. node stream   (파일 : FileOutputStream)
 * 3. filter stream (객체출력 : ObjectOutputStream)
 * 4. write 작업 : filter stream 메소드 사용
 * 
 * -- 정리 --
 * 5. 출력 filter stream 닫기
 * 
 * @author PC38206
 *
 */
public class WriteProductObject {

	public static void main(String[] args) throws IOException {
		// 1. 입력용 Product 객체 생성
		Product adidas = 
				new Product("S001", "슈퍼스타", 87200, 5);
		
		// 2. output node stream 
		FileOutputStream fos =
				new FileOutputStream("adidas.obj");
		
		// 3. output filter stream
		ObjectOutputStream out =
				new ObjectOutputStream(fos);
		
		// 4. write 작업
		out.writeObject(adidas);
		
		System.out.println("=== adidas 객체 출력 완료 ===");
		
		// 5. 출력 filter stream 닫기
		out.close();
		

	}

}








