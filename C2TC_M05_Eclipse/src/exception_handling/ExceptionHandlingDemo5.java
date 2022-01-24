package exception_handling;
import java.util.Scanner;
public class ExceptionHandlingDemo5 {
	static void validate(int age)
	{
		if(age<18)
			throw new ArithmeticException("not valid");
		else
			System.out.println("Welcome to vote");
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the age");
		int age=sc.nextInt();
		try
		{
			validate(age);
			
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		System.out.println("rest of the code...");
		

	}

}
