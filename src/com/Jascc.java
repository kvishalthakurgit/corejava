package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Jascc {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    String sArray[] = null;
    String rs = "";
    
    String p1 = null;
    String p2 = null;
    line = in.readLine();
    sArray = line.split(",");
    for(String s1 : sArray) {
    	if(p1 == null) {
    		p1 = s1;
    	}else {
    		p2=  s1;
    	}
    }
    
    int i = 1;
    while(p1.charAt(p1.length()-i) == p2.charAt(p2.length()-i)) {
    	Character c1= p1.charAt(p1.length()-i);
    	rs = rs.concat(c1.toString());
    	if(p1.length()-i<1) {
    		break;
    	}
    	i++;
    }   
    if(rs.isEmpty())
    	{rs = null;}
    else {
    for(int j = rs.length()-1; j>0; j--) {
    	System.out.print(rs.charAt(j));
    }
    	
    }
    
  }
}