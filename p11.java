import java.util.*;
class p11
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any three nos:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c =sc.nextInt();
		if(a>b&&a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>c&&b>a)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
		String res=(a>b&&a>c)?"a is greater":((b>c&&b>a)? "b is greater":("c is greater"));
		System.out.println(res);
	}
	
}