
	package threadsdemo;

	public class ThirdThread extends Thread{
		public void run()
		{
			for(int x=1;x<=10;x++)
			{
				System.out.println("The value of x is "+x);
				try
				{
				Thread.sleep(2000);
				}
				catch(InterruptedException ex)
				{
					System.out.println("Thread interrupted");
				}
			}
				
		}
		public static void main(String[] args) {
			FirstThread first=new FirstThread();
			
			first.start();
			try {
				first.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			SecondThread second=new SecondThread();
			second.start();
			try {
				second.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}

	}