class Star4
{
	public static void main(String args[])
	{
		for(int i=1;i<=3;i++)
		{
			for(int j=2;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			
			for(int f=1;f<=i;f++)
			{
				
				System.out.print(" ");
			}
			for(int g=3;g>=i;g--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}