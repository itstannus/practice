package practice;

public class Generic<T> {

	T[] array;

	public Generic(T[] array) {
		super();
		this.array = array;
	}
	
	
	public T[] getArray() {
		return array;
	}


	public static void main(String args[]){
		
		Object[] a={1,"hhjjh",9.0};
		System.out.println("a--"+a[0]+a[1]+a[2]);
		Generic g= new Generic(a);
		Object[] a1=g.getArray();
		System.out.println("aaa===="+a1[0]+a1[1]+a1[2]);
	}
}
