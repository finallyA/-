package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class copy {
public static void main(String[] args) throws IOException {
//	//创建字符输入流
////			File file=new File("D:/Add.java");
//			Reader reader=new FileReader("D:/Add.java");
//			BufferedReader br=new BufferedReader(reader);
//			//创建字符输出流
////			File f=new File("E:/Add.java");
//			Writer writer=new FileWriter("E:/Add.java");
//			BufferedWriter bw=new BufferedWriter(writer);
//			String buffer=null;
//			 /*按行读入，直到为空*/  
//			while(null !=(buffer = br.readLine())){  
//		        bw.write(buffer);  
//		        bw.newLine();  
//		  }  
//
//				/*关闭流*/  
//					br.close();  
//					bw.close();  
//				
//	System.out.println("字符流复制完成");
//	
	//创建字节输入流
   	File file=new File("D:/aa.rar");
		InputStream r=new FileInputStream(file);
	
		//创建字节输出流
//		File f=new File("E:/Add.java");
		OutputStream w=new FileOutputStream("E:/aa.rar");
	

		byte[] b=new byte[(int) file.length()];
		 /*按行读入，直到为空*/  
		int len=r.read(b);
		while(len!=-1){ 
			w.write(b, 0, len); 
			w.flush(); 
			len=r.read(b); 
		}
			/*关闭流*/  
				r.close();  
				w.close();  
				System.out.println("字节流复制完成");
				
     
}
}
