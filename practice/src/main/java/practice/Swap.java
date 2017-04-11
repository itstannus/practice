package practice;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a=4;
		Integer b=5;
		swap(a,b);
		System.out.println(a+"--"+b);
		

	}

	private static void swap(Integer a, Integer b) {
		Integer c=a;
		a=b;
		b=c;
		
	}

}
