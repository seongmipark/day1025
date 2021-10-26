package com.sist.exam03;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NotRuntimeExceptionTest {

	public static void main(String[] args) {
		
		/*try {
		FileWriter fw = new FileWriter("C:/work_day1025/hello.text");
		fw.write("�ȳ��ϼ���");
		fw.close();
		}
		catch(IOException e) {	
			System.out.println("���ܹ߻�:" + e.getMessage());
		}*/
		
		try {
		FileReader fr = new FileReader("C:/work_day1025/hello.text");
		int ch;
		while((ch = fr.read()) != -1) {
			System.out.println( (char)ch );
		}
		fr.close();
			
		}catch (Exception e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}	
	}
}
