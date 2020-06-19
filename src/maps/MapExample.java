package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map m=new HashMap<>();
		System.out.println(m.put("101", "Saurabh"));
		System.out.println(m.put("102", "Saurabh1"));
		System.out.println(m);
		Set s=m.entrySet();
		System.out.println(s);
	}
}
