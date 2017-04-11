package practice;

import java.util.concurrent.atomic.AtomicBoolean;

public class AtomiBooleanExPrintOneZero {
	
	public static void main(String args[]){
		AtomicBoolean printOne=new AtomicBoolean(true);
		Thread t1=new Thread(new PrintOne(printOne));
		Thread t2=new Thread(new PrintZero(printOne));
		t1.start();
		t2.start();
	}
	
	

}

class PrintOne implements Runnable{

	AtomicBoolean printOne;
	
	
	
	public PrintOne(AtomicBoolean printOne) {
		super();
		this.printOne = printOne;
	}



	public void run() {
		while(true){
			if(printOne.get()){
				System.out.println("1");
				printOne.compareAndSet(true,false);
			}
		}
		
		
	}
	
}

class PrintZero implements Runnable{

	AtomicBoolean printOne;
	
	
	
	public PrintZero(AtomicBoolean printOne) {
		super();
		this.printOne = printOne;
	}



	public void run() {
		while(true){
			if(!printOne.get()){
				System.out.println("0");
				printOne.compareAndSet(false,true);
			}
		}
		
		
	}
	
}
