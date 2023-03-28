import java.util.Scanner;
class min {
   public static void main(String args[]) {
    int num1, num2, num3;   
   Scanner sc = new Scanner(System.in);  
   System.out.println("Enter the first number:");  
   num1= sc.nextInt();  
   System.out.println("Enter the second number:");  
   num2 = sc.nextInt();  
  System.out.println("Enter the third number:");  
  num3 = sc.nextInt(); 
      if (num1 >= num2 && num1 >= num3)
         System.out.println( num1 + " is the maximum number.");
      else if (num2 >= num1 && num2 >= num3)
         System.out.println( num2 + " is the maximum number.");
      else
         System.out.println( num3 + " is the maximum number.");
	 if (num1 <= num2 && num1 <= num3)
         System.out.println( num1 + " is the minimum number.");
      else if (num2 <= num1 && num2 <= num3)
         System.out.println( num2 + " is the minimum number.");
      else
         System.out.println( num3 + " is the minimum number.");
	 
   }
}