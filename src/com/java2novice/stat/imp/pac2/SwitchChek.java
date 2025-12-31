package com.java2novice.stat.imp.pac2;

public class SwitchChek {  
    public static void main(String[] args) {  
    	int _$ = 10;
    	
    	System.out.println(_$++);
        String game = "Cricket";  
        switch(game){  
        case "Hockey":  
            System.out.println("Let's play Hockey");  
            break;  
        case "Cricket":  
            System.out.println("Let's play Cricket");  
            break;  
        case "Football":  
            System.out.println("Let's play Football");  
        }
        
        swExp();
    }

	private static void swExp() {
		String s1 = "vis";
		boolean b1 = switch(s1) {
		case "vis","ravi" -> true;
		default-> false;
		};
	}  
}  