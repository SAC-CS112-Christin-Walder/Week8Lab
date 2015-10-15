import java.util.Scanner;

public class Lab3
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = input.next();
		
		System.out.print("Enter your birth year (yyyy): ");
		int year = input.nextInt();
		
		int age = 2015-year;
		
		int legal = year + 21;
		
		if (age>=21)
			System.out.printf("Hello, %s, you are lawfully allowed to drink.", name);
		else {
			System.out.printf("Hello, %s, you are not lawfully allowed to drink. ", name); 
			System.out.printf("You will be allowed to drink in %d.", legal);
		}
	}
	
}