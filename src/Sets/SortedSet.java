package Sets;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class SortedSet {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("=====Adding 17 elements=======");
		for (int i = 0; i < 17; i++) {
			list.add(i);
			getCapacity(list);
		}
		System.out.println("=========Removing 8 elements =========");
		for (int i = 0; i < 8; i++) {
			list.remove(i);
			getCapacity(list);
			list.trimToSize();
			System.out.println("============Used Trim to Size========");
			getCapacity(list);
		}
	}

	static void getCapacity(ArrayList<?> l) throws Exception {
		Field dataField = ArrayList.class.getDeclaredField("elementData");
		dataField.setAccessible(true);
		System.out.format("Size: %2d, Capacity: %2d%n", l.size(), ((Object[]) dataField.get(l)).length);
	}
}
