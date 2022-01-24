package exception_handling;
import java.util.Scanner;



public class ExceptionHandlingDemo7
{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student id: ");
		int id=sc.nextInt();
		if(id>100)
		{
			System.out.println("Student found");
		}
		else
		{
			try
			{
				throw new StudentIdNotFoundException(id);
			}
			catch(StudentIdNotFoundException ife)
			{
				System.out.println(ife);
				System.out.println(ife.getMessage());
			}
		}

	}

}
