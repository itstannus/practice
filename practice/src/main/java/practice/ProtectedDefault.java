package practice;

public class ProtectedDefault {

	protected int a=10;
public static void main(String args[]){
		new Child().getA();
		new DefaultClass().getA();
	}

}
class Child extends ProtectedDefault{
	
	 void getA(){
		System.out.println("Child"+new ProtectedDefault().a);
	}
	
}
class DefaultClass{
	 void getA(){
		 System.out.println("DefaultClass"+new ProtectedDefault().a);
		}

}
