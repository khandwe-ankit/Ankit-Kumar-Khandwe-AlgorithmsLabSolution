package com.ankit.payMoney_Transactions.driver;

import java.util.Scanner;

import com.ankit.payMoney_Transactions.service.PayMoney_Service;

/**
 * This is a driver class which will take the input parameters, call required
 * methods & will print the ouput in the end.
 * 
 * @author Ankit Khandwe
 *
 * @created_On 19-Dec-2021
 */
public class PayMoney_MainDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the values of array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved");
		int noOfTargets = sc.nextInt();
		while (noOfTargets-- > 0) {
			System.out.println("Enter the value of target");
			int target = sc.nextInt();
			int result = PayMoney_Service.noOfTransactionNeeded(arr, target);
			if (result != -1)
				System.out.println("Target achieved after " + result + " transactions");
			else
				System.out.println("Given target is not achieved");
		}
		sc.close();
	}
}
