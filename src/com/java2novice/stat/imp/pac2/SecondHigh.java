package com.java2novice.stat.imp.pac2;

public class SecondHigh {

	
	public static void main(String[] args) {
		
		 int arr[] = {1,4,69,54,81,90,82};
		 int max = arr[0];
		 int scn = 0;
		 
		 for(int i=1;i<arr.length;i++)
		 {
			 if(max<arr[i])
			 {
				 scn = max;
				 max=arr[i];
			 }
			 else if(scn<arr[i] ) { 
				 scn = arr[i];
			 }
		 }
		
		 System.out.println("max="+max);
		 System.out.println("scn max="+scn);
		 
		 
		 
		 /* int a=max-arr[0];
		 int b=0;
		 int secMin=0;
		 for(int i=1;i<arr.length;i++)
		 {
			 if(arr[i]!=max)
			  b=max-arr[i];
			   if(a>b)
			   {
				   secMin=arr[i];
				   a=b;
			   }
		 }
		 System.out.println("1="+max);
		 System.out.println("2="+secMin);
		 */
		
	}
}
