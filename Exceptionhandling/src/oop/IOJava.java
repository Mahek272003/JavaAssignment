package oop;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOJava {
	void input() {
		
		FileInputStream in=null;
		FileOutputStream out=null;
		try {
		in=new FileInputStream("F:\\eclipse\\Exceptionhandling\\src\\oop\\InFile.java");
		out=new FileOutputStream("F:\\eclipse\\Exceptionhandling\\src\\oop\\OutFile.java");
		int c;
		while((c=in.read())!=-1) {
			out.write(c);
		}
		}
		catch (IOException e){
			
		}
		finally{
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}}
		public static void main(String args[]) {
		IOJava obj=new IOJava();
		obj.input();
		
	}
	}

