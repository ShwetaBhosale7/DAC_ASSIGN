import java.util.*;
class p7
{
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a year");
		int y=sc.nextInt();
		if(y%4==0)
		{
			if(y%100==0)
			{
				if(y%400==0)
				{
					System.out.println("leap year");
					
				}
				else
					System.out.println( "Not a leap year");
			}
			else
				System.out.println( "Not a leap year");
		}
		else
		{
			System.out.println( "Not a leap year");
			}
	String leap= (y%4==0)?((y%100==0)?((y%400==0)? "leap year": "Not a leap year"):"Not a leap year"):"Not a leap year";
    System.out.println(leap);	
	}
}