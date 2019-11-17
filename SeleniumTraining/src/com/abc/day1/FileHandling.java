package com.abc.day1;

import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("C:\\Users\\Nikhil\\newfile.txt");
			boolean fvar = file.createNewFile();
			if (fvar) {
				System.out.println("success");
					  }
			else {
				System.out.println("failed");
				 }
			
		}
		catch(IOException e) {
			System.out.println("Exception occured");
			e.printStackTrace();
		}
				
			}
				
			
					
		}

	


