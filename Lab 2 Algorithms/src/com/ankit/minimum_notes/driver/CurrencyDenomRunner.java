package com.ankit.minimum_notes.driver;

import java.util.Scanner;

import com.ankit.minimum_notes.service.CountNotes;

/**
 * This is a driver class which will take the input parameters, call required
 * method & then display the output.
 * 
 * @author Ankit Khandwe
 *
 * @created_On 19-Dec-2021
 */
public class CurrencyDenomRunner {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int size = sc.nextInt();
		System.out.println("Enter the currency denominations value");
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		int amt = sc.nextInt();
		int[] noteCount = CountNotes.minimumNotesRequired_1(arr, amt, size);

		for (int i = 0; i < noteCount.length; i++) {
			int count = noteCount[i];
			if (count != 0)
				System.out.println(arr[i] + " : " + count);
		}
		sc.close();
	}
}
