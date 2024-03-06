package com;

public class Emp123 
{
	private int age ;
	
	public Emp123( int age )
	{
		super();
		this.age = age;
	}

	public int hashCode()
	{
		System.out.println("hachcode call "+age);
		return age;
	}
	
	public boolean equals( Object obj )
	{
		boolean flag = false;
		Emp123 emp = ( Emp123 )obj;
		System.out.println("equals call "+emp.age);
		if( emp.age == age ) {
			flag = true;
		}
		System.out.println("flag="+flag);
		return flag;
	}
	
}
