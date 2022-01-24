package exception_handling;

public class ExceptionHandlingDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[4];
		try
		{
			//arr[4]=35; // exception
			arr[3]=35;
			System.out.println("In try block");
			
		}
		catch(ArrayIndexOutOfBoundsException aiobe)
		{
			aiobe.printStackTrace();
			System.out.println("Exception in try block");
		}
		finally
		{
			System.out.println("In finally block");
			
		}
		System.out.println("In the class");

	}

}
