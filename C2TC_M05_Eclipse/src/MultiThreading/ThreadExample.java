package MultiThreading;

public class ThreadExample extends Thread 
{

	
		int st;
		String msg;
		
		
		public ThreadExample(String msg,int st) 
		{
			this.st = st;
			this.msg = msg;
		}


		@Override
	public void run() 
		{
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			try
		{
				Thread.sleep(st);
		}
		catch(Exception e)
		{
		}
		System.out.println(msg+i);
		}
		}
	
	
	

}
