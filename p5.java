import java.util.*;
class p5
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any 2 nos:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("first no is: "+a+" second no is: "+b);
		
	}
}
class p6
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any 2 nos:");
		int a=sc.nextInt();
		if(a>=0)
		{
			System.out.println("Positive no");
		}
		else
		{
			System.out.println("Negative no");
		}
		String res=(a>0) ? "positive":"Negative"; 
		System.out.println(res);
	
		
	}
}
