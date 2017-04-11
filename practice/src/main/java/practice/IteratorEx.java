package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorEx {

	public static void main(String[] args) {
		List<String> rr=new ArrayList<String>();
		rr.add("eee");
		rr.add("yy");
		ListIterator<String> i=rr.listIterator();
		for(String str : rr){
			System.out.println(str);
			rr.add("rrrrr");
		} 
		while(i.hasNext()){
			System.out.println(i.next());
			i.add("foo");
			if(rr.size()==6)
				break;
			
		}
		System.out.println(rr);

	}

}
