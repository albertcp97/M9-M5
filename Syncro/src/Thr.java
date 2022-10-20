
public class Thr implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			
				Main.sum();
				/*synchronized (Main.class) {
					Main.sum();
				}*/
				
			
			//System.out.println(Main.contador);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
