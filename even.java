import java.util.Scanner;
class even{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any no");
	    n=sc.nextInt();
		String res=(n%2==0)?"Even":"Odd";
		System.out.println("The result is:"+res);
	}
}