class Star5
{
	public static void main(String args[])
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=2;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=3;k++)
			{
				System.out.print("*");
			}
			
			for(int f=4;f<=i;f++)
			{
				
				System.out.print(" ");
			}
			for(int g=6;g>=4;g--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}