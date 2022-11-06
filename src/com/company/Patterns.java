package com.company;
/*



i)

**********
**********
**********
**********

ii)

*
**
***
****
*****

iii)

        *
      **
    ***
  ****
*****



iv)

        *
      ***
    *****
  *******
*********

v)

        1
      222
    33333
  4444444
555555555

vi)

        1
      212
    32123
  4321234
543212345

 */

public class Patterns {
	public static void main(String[] args) {
		
		//pattern i
		
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//pattern ii
		
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("___________________");
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("___________________");
		
		
		for (int i = 0; i <= 5; i++) {
			for (int j = 2 * (5 - i); j >= 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
	
}
