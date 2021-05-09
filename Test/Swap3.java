import java.util.*;
class Swap3
{
	public static void main(String[]args)
	{Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the digit1: ");
		int num1 = sc.nextInt();  //2
		System.out.println("Enter the digit2: ");
		int num2 = sc.nextInt();   //3
		
		num2 = num1 + num2 - (num1=num2);
		
		System.out.println("Digit1 = "+num1 +" "+"Digit2 = "+num2);
	}
}