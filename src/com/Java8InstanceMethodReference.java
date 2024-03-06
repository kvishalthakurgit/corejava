package com;

interface Sayable{  
    void say(int input);
    //void say1();
}  
public class Java8InstanceMethodReference {  
    public void saySomething(int input){  
        System.out.println("Hello, this is non-static method."+input);  
    }  
    
    public void saySomething1(){  
        System.out.println("Hello, this is non-static method.");  
    } 
    public static void main(String[] args) {  
    	Java8InstanceMethodReference methodReference = new Java8InstanceMethodReference(); // Creating object  
            Sayable sayable = methodReference::saySomething;  
            sayable.say(100);  
            //Sayable sayable2 = new Java8InstanceMethodReference()::saySomething1; // You can use anonymous object also  
            //sayable2.say1();  
    }  
}  
