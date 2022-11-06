package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sortArray {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int[] numbers = new int[Integer.parseInt(reader.readLine())];
		for (int f = 0; f < numbers.length; f++) {
			numbers[f] = (int) (Math.random() * 100 + 1);
		}
		
		for (int j = 0; j < numbers.length - 1; j++) {
			for (int i = 0; i < numbers.length - j - 1; i++) {
				if (numbers[i + 1] < numbers[i]) {
					numbers[i]=numbers[i]^numbers[i+1];
					numbers[i+1]=numbers[i]^numbers[i+1];
					numbers[i]=numbers[i]^numbers[i+1];
				}
			}
		}
		for (int j : numbers
		) {
			System.out.print(j+" ");
			
		}
	}
}
