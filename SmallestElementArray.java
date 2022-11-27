package com.bridgelabz.day3;

//Java Program to print the smallest element in an array
public class SmallestElementArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 25, 11, 7, 75, 56 };
		int min = arr[0];
		// Loop through the array
		for (int i = 0; i < arr.length; i++) {
			// Compare elements of array with min
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("Smallest element present in given array: " + min);
	}

}
