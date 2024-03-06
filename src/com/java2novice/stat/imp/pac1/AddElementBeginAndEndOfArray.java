package com.java2novice.stat.imp.pac1;

public class AddElementBeginAndEndOfArray {

	public static void main(String[] args) {
		int original[] = {2, 3, 4, 5, 6};
		int sElement = original[0] - 1;
		int lElement = original[original.length - 1] + 1;
		
		int[] updateArray = updateArray(original, sElement, lElement);
		
		for (int x : original)
			System.out.print(x);
		System.out.println("-------------");
		for (int x : updateArray)
			System.out.println(x);
	}

	public static int[] updateArray(int[] original, int s, int l) {
		int result[] = new int[original.length + 2];
		result[0] = s;
		for (int x = 0; x < original.length; x++) {
			result[x + 1] = original[x];
		}
		result[result.length - 1] = l;
		return result;
	}

}
