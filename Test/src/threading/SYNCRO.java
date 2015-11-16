package threading;

public class SYNCRO {
	static int count=0;
	synchronized static void increment(){
		count++;
	}
	public static void main(String[] args) {
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<20000;i++)
					increment();
				
			}
		});
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<20000;i++)
					increment();
			}
		});
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("COUNT = "+count);
	}
}
