package MultiThreading;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExample thread1=new ThreadExample("First", 2000);
		ThreadExample thread2=new ThreadExample("Second",4000);
		
		thread1.start();
		thread2.start();
		try
		{
			thread1.join();
			thread2.join();
			
		}
		catch(Exception e)
		{
			
		}
		for(int i=0;i<10;i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				
			}
			System.out.println("main"+i);
		}

	}

}
