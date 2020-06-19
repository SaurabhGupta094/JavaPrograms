package Sets;

import java.util.HashSet;
import java.util.Set;

public class SetBasicExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set=new HashSet<>();
		set.add("a");
		set.add("b");
		boolean bA=set.add("a");
		boolean bNull=set.add(null);
		set.add(null);
		set.add("ab");
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(bNull);
		System.out.println(bA);
		
		
	}

	

}
