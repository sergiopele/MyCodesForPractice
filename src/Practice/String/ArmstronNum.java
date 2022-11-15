package Practice.String;
/*
A number is called an Armstrong number if it is equal to the cube of its every digit.
For example, 153 is an Armstrong number because of 153= 1+ 125+27,
which is equal to 1^3+5^3+3^3. You need to write a program to check
if the given number is Armstrong number or not.
 */

import java.util.Scanner;

public class ArmstronNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num =scan.nextInt();
		int result =0;
		int temp = num;
		while(temp!=0){
			int digits = temp%10;
			result+=(int)Math.pow(digits,3);
			temp=temp/10;
		}
		boolean isArmstrongNum=result==num;
		System.out.println("Is number Armstrong: "+isArmstrongNum);
		scan.close();
	}
}
