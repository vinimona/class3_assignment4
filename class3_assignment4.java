// Design a very basic calculator having features like add, subtract, multiply and division.
// Using class, object and methods
// Expected Output :- 
// Should take inputs of value and operation (+, -,/,*) to be performed from the user. Should print resultant calculated value.

package Class3_assignments;

import java.util.Scanner;

public class class3_assignment4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2, optr, result;
		Scanner scan_in = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		num1 = scan_in.nextInt();
		num2 = scan_in.nextInt();
		System.out.println("Enter the value for operation to be performed (1 - '+', 2 - '-', 3 - '*' or 4 - '/') : ");
		optr = scan_in.nextInt();
		
		calculator calc = new calculator();
		
		switch (optr)
		{
			case 1 : result = calc.add(num1, num2);
					 System.out.println(num1 + " + " + num2 + " = " + result);
					 break;
			case 2 : result = calc.substract(num1, num2);
					 System.out.println(num1 + " - " + num2 + " = " + result);
					 break;
			case 3 : result = calc.multiply(num1, num2);
					 System.out.println(num1 + " * " + num2 + " = " + result);
					 break;
			case 4 : result = calc.divide(num1, num2);
					 System.out.println(num1 + " / " + num2 + " = " + result);
					 break;
			default : System.out.println("Invalid operation !");
		
		}
		
		if (scan_in != null)
			scan_in.close();
		
	}

}
