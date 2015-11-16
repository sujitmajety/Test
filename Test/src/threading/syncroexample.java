package threading;

public class syncroexample {
	static int count=0;
	public synchronized static void increment(){
		count++;
	}
	public static void main(String[] args) {
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<20000;i++){
					increment();
				}
			}
		});
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<20000;i++){
					increment();
				}
			}
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Count = "+count);
	}
}
