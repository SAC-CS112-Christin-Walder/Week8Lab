import java.util.Scanner;

public class Lab1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = input.next();
		
		System.out.print("Enter your birth year (yyyy): ");
		int year = input.nextInt();
		
		int age = 2015-year;
		
		System.out.printf("Hello, %s, you're %d years old today!", name, age);
		
	}
	
}