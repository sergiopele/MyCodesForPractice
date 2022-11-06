package com.company;

import java.util.Scanner;

public class biggestAndSmallestNumArr {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayService service1 = new ArrayService();
		
		int size = scan.nextInt();
		int[] arr = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Target element: " + service1.ArrElementSearcher(arr, 10));
		
		int[] reverseOrderArrr = service1.ReverseOrderArr(arr);
		service1.Arrayprinter(reverseOrderArrr);
		
		int[] sortedArray = service1.BubbleSorting(arr);
		service1.Arrayprinter(sortedArray);
	}
}

class ArrayService {
	void Arrayprinter(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	
	int ArrElementSearcher(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (target == arr[i]) {
				return target;
			}
		}
		return 0;
	}
	
	int[] ReverseOrderArr(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		return arr;
	}
	
	int[] BubbleSorting(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			
			
		}
		return arr;
	}
	
	int MaxArrElement(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max = (max < arr[i] ? arr[i] : max);
		}
		return max;
	}
	
	int MinArrElement(int[] arr) {
		int min = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			min = (min > arr[i] ? arr[i] : min);
		}
		return min;
	}
}
