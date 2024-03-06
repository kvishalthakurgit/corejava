package ipa;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main1 {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
	    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
	    BufferedReader in = new BufferedReader(reader);
	    String line;
	    while ((line = in.readLine()) != null) {
	    	String sArry[]= line.split(",");
	    	if(sArry.length!=2) {
	    		System.out.println("Wrong string pattern");
	    		break;
	    	}
	    	//cornfield,outfield
	    	String s2 = null;
	    	String s3 = null;
	    	String s4 = "";
	    	for(String s1: sArry)
	    	{
	    		if(s2==null) {
	    		s2= s1.trim();
	    		} 
	    		else if(s3 == null){
	    		s3= s1.trim();
	    		}else {
	    		break;
	    		}
	    	}
            //System.out.println(s2.charAt(s2.length()-2));
	    	int i=1;
	    	while(i<=s2.length() && i <=s3.length()) {
	    		Character c1 = s2.charAt(s2.length()-i);
	    		Character c2 = s3.charAt(s3.length()-i);
	    		
	    		if(c1 == c2) {
	    			s4 = s4.concat(c1.toString());
	    		}else {
	    			break;
	    		}
	    		i++;
	    	}
	    	StringBuffer s5 = new StringBuffer(s4);
	    	if(s4.isEmpty()) {
	    	s4 = null;
	    	System.out.println(s4);
	    	}else {
	    		System.out.println(s5.reverse());
	    	}
	    }
	  }

}