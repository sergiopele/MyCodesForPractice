package Practice.String;

import java.util.Scanner;

/*
This is generally asked as follow-up or alternative of the previous program.
This time you need to check if given Integer is palindrome or not.
An integer is called palindrome if it's equal to its reverse, e.g. 1001 is a palindrome,
but 1234 is not because the reverse of 1234 is 4321 which is not equal to 1234.
You can use divide by 10 to reduce the number and modulus 10 to get the last digit.
This trick is used to solve this problem.
 */
public class IntegerPalindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int temp=num;
		
		int reverse=0;
		while(num!=0){
			int digits=num%10;
			reverse=reverse*10+digits;
			num=num/10;
		}
		boolean isPalindrome=reverse==temp;
		System.out.println("Is number palindrome: "+isPalindrome);
		scan.close();
	}
}
