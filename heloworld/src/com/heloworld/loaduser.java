package com.heloworld;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//Read contents of userscores file.
//serload menu:
//Welcome, 
// asfuture revision : autosave balls every 10 rolls	
//if empty, ask to create new user, and load credit
//
//
//
public class loaduser {

	public static void main(String[] args) throws IOException {
		BufferedReader in = null;
		List<String> myList = new ArrayList<String>();
		try {   
		    in = new BufferedReader(new FileReader("users.txt"));
		    String str;
		    while ((str = in.readLine()) != null) {
		        myList.add(str);
		    }
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		} finally {
		    if (in != null) {
		        in.close();
		    }
		}
		for(int i = 0; i < myList.size(); i++) {   
		    System.out.println("User Number : ");
			System.out.print(myList.get(i));
		}  
}
}