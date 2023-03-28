import java.util.*;
class percentage{
	public static void main(string args[])
	{
		Scanner a=new Scanner(System.in)
		{
			int marks;
			int per;
			System.out.println("Enter total marks out of 600");
			marks=a.nextInt();
			per=(int(marks/600)*100);
			if(per>=95)
			{
				System.out.println("Distinction");
			}
			else if(per>=85)
			{
				System.out.println("First Division");
			}
			else if(per>=75)
			{
				System.out.println("Second Division");
			}
			else(per<75)
			{
				System.out.println("Average");
			}
			
		}
	}
	
}