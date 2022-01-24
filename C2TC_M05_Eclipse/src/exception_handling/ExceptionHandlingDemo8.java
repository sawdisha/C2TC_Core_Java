package exception_handling;
import java.io.IOException;
public class ExceptionHandlingDemo8 {
	void m()throws IOException
	{
		throw new IOException("device error");//checked exception
	}
	void n()throws IOException
	{
		m();
	}
	void p()
	{
		try
		{
			n();
		}
		catch(Exception e)
		{
			System.out.println("exception handled");
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ExceptionHandlingDemo8 obj=new ExceptionHandlingDemo8();
		obj.p();
		System.out.println("normal flow...");
	}
}
