package practice;

public class ConstructorEx {
	int a;
	
	ConstructorEx(int a){
		a=a;
	}
	
	

	public int getA() {
		return a;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorEx c=new ConstructorEx(4);
		System.out.println(c.getA());
		

	}

}
