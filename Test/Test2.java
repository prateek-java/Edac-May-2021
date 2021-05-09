
//2. WAP to accept number from user(Scanner class) print table of it
	//5*1=5
	//5*2=10
	//5*3=15
	//5*4=20
	

import java.util.*;
class Test2
{
	public static void main(String args[])
	{
		int i;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the digit: ");
		int num = sc.nextInt();
		
		for(i=1;i<=10;i++)
		{
			
			System.out.println(num+"*"+i+"="+num * i);
		}
	}
}
