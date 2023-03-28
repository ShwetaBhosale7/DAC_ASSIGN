import java.util.*;
class p4
{
	static int factorial(int n)
	{
	if(n==0)
	{
		return 1;
	}
	else
	{
		return(n*factorial(n-1));
	}
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		int n=sc.nextInt();
		int fact=1;
		fact=factorial(n);
		int f1=1;
		int f2=1;
		for(int i=1; i<=n; i++)
		{
			f1=f1*i;
		    f2=n*i;
		}
		System.out.println(fact);
		System.out.println(f1);
		System.out.println(f2);
		
	}
	
}