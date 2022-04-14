
	package threadsdemo;

	public class SecondThrad extends Thread{
		public void run()
		{
			for(int x=10;x>=1;x--)
			{
				System.out.println("Thread value is "+x);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}


