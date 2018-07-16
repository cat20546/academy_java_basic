package io.data;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 객체 데이터 담긴 파일을 읽어서
 * 데이터 단위의 입력 받고
 * 그 내용으로 객체를 생성
 * -------------------------------------------------
 * -- 입력 --
 * 1. node stream (파일 : FileInputStream)
 * 2. filter stream (데이터 단위 입력 : DataInputStream)
 * 3. read 작업 : filter stream 메소드로 작업
 * 
 * -- 출력 --
 * 4. read 를 통해 얻은 데이터로 객체 생성
 * 5. 표준 출력(콘솔 : System.out) 
 * 
 * -- 정리 --
 * 6. 입력 filter stream 닫기
 * 
 * @author PC38206
 *
 */
public class ReadProductData {

	public static void main(String[] args) throws IOException {
		// 1. input node stream
		FileInputStream fin = 
				new FileInputStream("adidas.data");
		
		// 2. input filter stream : data input stream
		DataInputStream in =
				new DataInputStream(fin);
		
		// 3. read 작업
		//  (1) product 객체 포장을 위해 필요한 변수들에 담기
		String prodCode = in.readUTF();
		String prodName = in.readUTF();
		int price = in.readInt();
		int quantity = in.readInt();
		
		//  (2) 값이 들어있는 변수로 Product 객체 생성
		Product adidas = 
				new Product(prodCode, prodName, price, quantity);
		
		// 4. 표준 출력
		System.out.println(adidas);
		
		// 5. 입력 filter stream 닫기
		in.close();
	}

}









