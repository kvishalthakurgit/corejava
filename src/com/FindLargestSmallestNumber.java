package com;

public class FindLargestSmallestNumber {
	public static void main(String[] args) {

		//firstLargestNumber();
		secondLargestNumber();
	}

	private static void secondLargestNumber() {
		int num[] = {70,1010,1010,80,90,60,50,95};

		int largetst = num[0];
		int scndLarge = num[1];

		for (int i = 1; i < num.length; i++) {
			if (num[i] > largetst){
				scndLarge = largetst;
				largetst = num[i];
			}else if(num[i]>scndLarge && num[i]!=largetst) {
				scndLarge = num[i];
			}
		}
		System.out.println("Largest="+largetst);
		System.out.println("secondLargest="+scndLarge);
	}

	/*private static void firstLargestNumber() {
		int num[] = { 32, 43, 53, 54, 32, 65, 63, 98, 43, 23 };

		int smallest = num[0];
		int largetst = num[0];

		for (int i = 1; i < num.length; i++) {
			if (num[i] > largetst)
				largetst = num[i];

			else if (num[i] < smallest)
				smallest = num[i];
		}
		System.out.println("Largest="+largetst);
	}*/
}
