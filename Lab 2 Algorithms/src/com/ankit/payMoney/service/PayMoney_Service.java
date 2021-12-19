package com.ankit.payMoney.service;

public class PayMoney_Service {

	/**
	 * This method will return the number of transaction required to achieve the
	 * target
	 * 
	 * @param arr
	 * @param target
	 * @return number of transaction required
	 */
	public static int noOfTransactionNeeded(int[] arr, int target) {
		int sum = 0;
//		MergeSort.mergeSort_desc(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum >= target)
				return ++i;
		}

		return -1;// will return -1 if the sum doesn't reach the target

	}
}
