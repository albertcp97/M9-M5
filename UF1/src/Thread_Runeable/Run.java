package Thread_Runeable;

public class Run implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			System.out.println(Thread.currentThread().getName()+": "+Main2.contador++);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
