package comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {

		TreeSet<String> t = new TreeSet<>(new MyComparator());
		t.add("Maa");
		t.add("Baa");
		t.add("Paa");
		t.add("Chaa");
		System.out.println(t);
	}
}

class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s1.compareTo(s2);

	}

}