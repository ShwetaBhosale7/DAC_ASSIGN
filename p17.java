import java.util.*;
class p17
{
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any no");
		int n=sc.nextInt();
		int b=n;
		int rev=0;
		while(n>0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}
		System.out.println(rev);
		System.out.println(b);
		if(b==rev)
		{
			System.out.println("Pallindrome");
		}
		else{System.out.println("not");}
		
	}
}