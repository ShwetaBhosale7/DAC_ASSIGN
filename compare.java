import java.util.Scanner;
class compare{
	public static void main(String[] args)
	{
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1St no");
		n1=sc.nextInt();
		System.out.println("Enter 2nd no");
		n2=sc.nextInt();
		int res=(n1>n2)?n1+n2:n1-n2;
		System.out.println("result is:"+res);
	}
}