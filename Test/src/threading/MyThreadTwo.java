package threading;

public class MyThreadTwo extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
				System.out.println("MY THREAD TWO : "+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
