package strings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ObjectClassExample {
	public static void main(String... a) {
		List l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		Iterator i = l.iterator();
		System.out.println(i.hasNext());
		System.out.println(i.next());
		System.out.println(i.hasNext());
		System.out.println(i.next());
		System.out.println(i.hasNext());
		System.out.println(i.next());
		System.out.println(i.hasNext());
		System.out.println(i.next());
		System.out.println(i.hasNext());
		System.out.println(i.hasNext());
		System.out.println(i.hasNext());
		
	}
}