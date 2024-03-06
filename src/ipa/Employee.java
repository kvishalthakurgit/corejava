package ipa;

import java.io.Serializable;


public class Employee extends Human implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4890909519383077612L;
	/**
	 * 
	 */
	public String name;
	public String address;
	public transient int SSN;
	public int number;
	
	public Employee(int ssn, String name) {
		this.SSN = ssn;
		this.name = name;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public void mailCheck() {
		System.out.println("Mailing a check to " + name + " " + address);
	}
	
	@Override
	public int hashCode() {
		return this.SSN;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee e1 = (Employee)obj;
		return this.SSN ==e1.SSN;
	}
}
