package com.ankit.sorting;

public class MergeSort {

	/**
	 * Merge sort in descending order
	 * 
	 * @param arr
	 * @param leftIndex
	 * @param rightIndex
	 */

	public static void mergeSort_desc(int[] arr, int leftIndex, int rightIndex) {
		int mid = (leftIndex + rightIndex) / 2;
		if (leftIndex < rightIndex) {
			mergeSort_desc(arr, leftIndex, mid);
			mergeSort_desc(arr, mid + 1, rightIndex);
			mergeSortedArr(arr, leftIndex, mid, rightIndex);
		}

	}

	private static void mergeSortedArr(int[] arr, int leftIndex, int mid, int rightIndex) {
		int leftArrSize = mid - leftIndex + 1;
		int rightArrSize = rightIndex - mid;

		int[] leftArr = new int[leftArrSize];
		int[] rightArr = new int[rightArrSize];

		for (int i = 0; i < leftArrSize; i++)
			leftArr[i] = arr[leftIndex + i];
		for (int i = 0; i < rightArrSize; i++)
			rightArr[i] = arr[mid + 1 + i];

		int i, j, k;
		i = j = 0;
		k = leftIndex;
		while (i < leftArrSize && j < rightArrSize) {
			if (leftArr[i] > rightArr[j])// using > for descending order sort
				arr[k++] = leftArr[i++];
			else
				arr[k++] = rightArr[j++];
		}

		while (i < leftArrSize)
			arr[k++] = leftArr[i++];
		while (j < rightArrSize)
			arr[k++] = rightArr[j++];
	}

}
