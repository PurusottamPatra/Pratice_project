package com.simplilearn.filehandeling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Filehandelingappend {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter a = new FileWriter("E:\\Writing.txt",true);
		BufferedWriter b= new BufferedWriter(a);
		b.write("I am working in Mphasis");
		b.newLine();
		b.close();
	    a.close();
	    System.out.println("File appended");
	}

}