package io.basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 파일로 입력을 받아서
 * 표준 출력(콘솔창)을 하는 클래스
 * ----------------------------------------------
 * -- 입력 --
 * 1. node stream (파일(문자 파일:reader) : FileReader)
 * 2. filter stream (reader -> reader : BufferdReader)
 * 3. filter stream 메소드 사용 : readLine()
 * 
 * -- 출력 --
 * 4. node stream (표준 출력 : System.out : PrintStream)
 * 5. 1줄 출력 : println() 메소드 사용  
 * 
 * -- 정리 --
 * 6. 입력 filter stream 닫기
 * 
 * @author PC38206
 *
 */
public class FileInput {

	public static void main(String[] args) throws IOException {

		// 1. input node stream : file reader
		FileReader fr = new FileReader("out.txt");
		
		// 2. input filter stream : reader -> reader
		BufferedReader br =
				new BufferedReader(fr);
		
		// 3. filter stream 메소드로 읽기 : readLine();
		String input = null;
		
		while ((input = br.readLine()) != null) {
			// 4. 5.
			System.out.println("파일에서 읽은 데이터:" + input);
		}
		
		// 6. input filter stream 닫기
		br.close();
		
	}

}






