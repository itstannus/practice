package practice;

public class JoinEx {

	public static void main(String[] args) {
		
		
		Thread t1=new Thread(new Runnable(){
			public void run(){
				int i=0;
				while(i<3){
					try {
						Thread.sleep(1000);
						int a=9/0;
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("child thread");
					i++;
				}
			}
		});
		t1.start();
		
		try {
			
			t1.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main thred");

	}

}
