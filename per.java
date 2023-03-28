import java.util.*;
class per{
	public static void main(String args[])
	{
		Scanner a=new Scanner(System.in);
			int marks;
			double per;
			System.out.println("Enter total marks out of 600");
			marks=a.nextInt();
			per=double.class (marks/600)*100;
			System.out.println("Enter percentage"+per);
			if(per>=95.00)
			{
				System.out.println("Distinction");
			}
			else if(per>=85.00)
			{
				System.out.println("First Division");
			}
			else if(per>=75.00)
			{
				System.out.println("Second Division");
			}
			else if(per<75.00)
			{
				System.out.println("Average");
			}
			
			
		}
	}