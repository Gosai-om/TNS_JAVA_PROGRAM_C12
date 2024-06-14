package synchronization;

class counter
{
	int cnt;
	public synchronized void get_increment()
	{
		cnt++;
	}
}

public class Counter_Example {

		public static void main(String[] args) {
			counter c = new counter();
			
			Thread t1 = new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
						for(int i=0; i<10; i++)
						{
							c.get_increment();
						}
				}
			});
			
			
			Thread t2 = new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					for(int i=0; i<10; i++)
					{
						c.get_increment();
					}
				}
			});
			
			t1.start();
			t2.start();
			
			try 
			{
				t1.join();
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(c.cnt);
		}
}
