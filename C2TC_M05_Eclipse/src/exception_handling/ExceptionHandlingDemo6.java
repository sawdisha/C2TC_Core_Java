package exception_handling;

public class ExceptionHandlingDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int x=10/10;
			try
			{
				int y=10/0;
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		finally
		{
			System.out.println("Finally block");
			try
			{
				int y=10/0;
			}
			catch(Exception e)
			{
				try
				{
					int z=30/30;
				}
				finally
				{
					System.out.println("In finally under catch");
				}
				System.out.println(e);
									
			}
		}

	}
}


