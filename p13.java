import java.util.*;
class p13
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any no");
		int n=sc.nextInt();
		while(n>0)
		{
			int rem=n%10;
			System.out.print(rem);
			n=n/10;
		}
	}
}