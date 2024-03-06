package ipa;

public class ArraySort {



public static void main(String[] args) {
	int arr[] = {1,4,3,2,5,4,3,2,1,0,1};
	
	int arr1[]=new int[arr.length];
	
	int count =-1,count2=arr.length;
	int lastValue=4;
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]!=lastValue)
			arr1[++count]=arr[i];
		else
		  arr1[--count2]=arr[i];
	
	}
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr1[i]+",");
	}
	
}
}
