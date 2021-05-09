import java.util.*;
class Arr
{
	
	public static void main(String[]args)
	{Scanner sc = new Scanner(System.in);
			int a[]= new int[5];
			for(int i=0; i<a.length;i++)
				{
					a[i] = sc.nextInt();
				}


			for(int x:a)
			{
				
				System.out.print(""+x+" ");
			}System.out.println();
			for(int i = 4;i>=0;i--)
			{
				System.out.print(a[i]+" ");
			}
	}
	
}
