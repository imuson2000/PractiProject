	package threadsdemo;

	public class FirstThread extends Thread{
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
			FirstThread second=new FirstThread();
			first.start();
			second.start();
		}

	}
	