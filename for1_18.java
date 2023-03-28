class for1_18
{
	public static void main(String args[])
	{
		char a=70;
		for(int i=0;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print((char)(a-j)+" ");
			}
			System.out.println();
		
		}
	}
}