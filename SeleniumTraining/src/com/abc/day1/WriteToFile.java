package com.abc.day1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class WriteToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Nikhil\\new1.txt");
			String s = " life is beautiful";
			byte b[] = s.getBytes();  //converting string to bytes ,,streams handles byte or character so need to convert
			fout.write(b);
			fout.close();
			System.out.println("success");
		}
		catch (FileNotFoundException fn)
		{
			System.out.println("failed");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
			
			
		
	}

}
