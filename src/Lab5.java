import java.util.Scanner;

public class Lab5
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String repeat = "";
		
		do {
		
			System.out.print("Enter your name: ");
			String name = input.next();
			
			System.out.print("Enter your birth year (yyyy): ");
			int year = input.nextInt();
			
			int age = 2015-year;
			int legal = year + 21;
			
			if (age>=21)
				System.out.printf("Hello, %s, you are lawfully allowed to drink.\n\n", name);
			else {
				System.out.printf("Hello, %s, you are not lawfully allowed to drink. ", name); 
				System.out.printf("You will be allowed to drink in %d.\n\n", legal);
				}
			
			System.out.print("Would you like to try again? (Yes or no): ");
			repeat = input.next();
			repeat = repeat.toUpperCase();
			
		}
		
		while (repeat.equals("YES"));
		
	}
	
}