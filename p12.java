import java.util.*;
class p12
{
	static int add(int a,int b)
	{
		for(int i=1;i<=b;i++)
		{
			a++;
		}
		return a;
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any two nos");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int res=add(a,b);
		System.out.println("Addition of nos:"+res);
		
	}
}