package com.ankit.minimum_Notes_Required.service;

import com.ankit.sorting.MergeSort;

public class CountNotes {
	/**
	 * Simple to understand but time complexity will high because of nested for &
	 * while loops
	 * 
	 * @param arr
	 * @param amt
	 * @param size
	 * @return noteCountArray
	 */
	public static int[] minimumNotesRequired(int[] arr, int amt, int size) {

		MergeSort.mergeSort_desc(arr, 0, size - 1);
		int[] noteCountArray = new int[size];
		int index = 0;
		int sum = 0;
		for (int i = 0; i < size; i++) {
			int j = 1;
			while ((sum + arr[i] * j) <= amt) {
				j++;
			}
			sum = sum + arr[i] * --j;
			noteCountArray[index++] = j;
			if (sum == amt)
				return noteCountArray;
		}
		return noteCountArray;

	}

	/**
	 * Low time complexity solution
	 * 
	 * @param arr
	 * @param amt
	 * @param size
	 * @return noteCountArray
	 */
	public static int[] minimumNotesRequired_1(int[] arr, int amt, int size) {
		MergeSort.mergeSort_desc(arr, 0, size - 1);
		int[] noteCountArray = new int[size];
		int index = 0;
		for (int i = 0; i < size; i++) {
			if (amt >= arr[i]) {
				int temp = amt / arr[i];
				amt = amt - temp * arr[i];
				noteCountArray[index++] = temp;
			}
			if (amt <= 0)
				return noteCountArray;
		}
		return noteCountArray;

	}
}
