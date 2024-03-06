package ipa;

import java.util.HashMap;
import java.util.Map;

public class HashcodeCrhck {
	public static void main(String[] args) {
		/*Integer i = new Integer(100);
		Integer j = new Integer(100);
		
		System.out.println(j.hashCode()==i.hashCode());
		System.out.println(i==j);
		System.out.println(i.equals(j));*/
		
		 Map<Integer,String> m1 = new HashMap<Integer,String>();
		 m1.put(100, "fff");
		 m1.put(101, "fff");
		 m1.put(102, "fff");
		 
		 m1.hashCode();
		 
		 System.out.println(m1);

	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 100;
	}
}
