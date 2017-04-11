package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecServicePractice {

	public static void main(String[] args) {
		ExecutorService exec=Executors.newFixedThreadPool(10);
		List<Future> futurelist=new ArrayList<Future>();
		Callable c = new CallableEx();
		
		for(int i=0 ; i<5; i++){
			futurelist.add(exec.submit(c));
			futurelist.add(exec.submit(new Runnable(){
				public void run(){
					System.out.println("yede");
					throw new RuntimeException("yeda exception");
				}
			}));
			
		}
		for(Future f : futurelist){
			try {
				System.out.println(f.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		exec.shutdown();
		

	}

}

class CallableEx implements Callable<Integer>{
	
	public Integer call(){
		int sum=0;
		for(int i=0;i<100;i++){
			sum+=(i*3);
		}
		return sum;
	}
}
