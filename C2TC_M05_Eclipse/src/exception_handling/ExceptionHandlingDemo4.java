package exception_handling;
public class ExceptionHandlingDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		int b=0;
		int p=23;
		int[]x=new int[4];
		try
		{
			if(b==0)
				throw new ArithmeticException("This is arithmetic exception");
			else
				a=a/b;
			x[p]=10;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.getMessage());
		}
		catch(Exception ae)
		{
			System.out.println(ae.getMessage());
		}

	}

}
