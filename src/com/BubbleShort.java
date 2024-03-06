package com;

public class BubbleShort {
	public static void main(String[] args) {
		int []ar = {1,324,5,67,4,23,56,4};   // 324,5,67,4
		BubbleShort b1 = new BubbleShort(); // 5,324,67,4
		b1.bubbleSort(ar);                   // 5,67,324,4
		for(int i=0;i<ar.length;i++){         // 5,67,4,324
			System.out.print(ar[i]+" ");
		}
	}
	private void bubbleSort(int[] arr) {
		int num = 0;
		for(int i=0;i<arr.length;i++){  
			for(int j=1; j<arr.length;j++){
				if(arr[j-1]>arr[j]){
					num = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = num;
				}
			}
		}
	}
}
