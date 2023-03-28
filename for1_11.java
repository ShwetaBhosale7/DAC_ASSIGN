class for1_11
{
	public static void main(String args[])
	{
		for(int i=0;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int k1=1;k1<=i;k1++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}