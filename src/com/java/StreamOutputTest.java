package com.java;

import java.io.*;

public class StreamOutputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			FileOutputStream out = new FileOutputStream("C:\\Github\\now_coder\\data\\output.txt");
			out.write("×Ö·û´®Ð´Èë²âÊÔ³ÌÐò".getBytes());
			out.close();
		}
		catch(IOException ioe){
			//do nothing
		}
	}

}
