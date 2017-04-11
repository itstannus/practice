package practice;

public class ThreadPractice {
	


	
	public static void main(String args[]){
		Object lock = new Object();
		MutableBoolean flag=new MutableBoolean();
		flag.setFlag(true);
		Thread t1= new Thread(new A(flag, lock));
		flag.setFlag(false);
		Thread t2= new Thread(new B(flag, lock));
		t1.start();
		t2.start();
	}


}

class A implements Runnable{
	MutableBoolean otherPrint;
	Object lock;
	public A(MutableBoolean otherPrint, Object lock){
		this.otherPrint=otherPrint;
		this.lock=lock;
	}

	public void run() {
		while(true){
		synchronized(lock){
			
				while(otherPrint.getFlag()==true){
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				System.out.println("1");
				otherPrint.setFlag(true);;
//				lock.notifyAll();
			}
			
		}
		
		
	}
	
}
class B implements Runnable{

	MutableBoolean otherPrint;
	Object lock;
	public B(MutableBoolean otherPrint, Object lock){
		this.otherPrint=otherPrint;
		this.lock=lock;
	}
	public void run() {
		while(true){
		synchronized(lock){
			
				while(otherPrint.getFlag()==false){
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("0");
				otherPrint.setFlag(false);
//				lock.notifyAll();
			}
			
		}
		
		
	}
	
}

class MutableBoolean{
	boolean flag;

	public boolean getFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	
}
