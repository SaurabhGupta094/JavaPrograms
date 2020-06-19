import java.util.Arrays;
import java.util.List;

public class SampleArrayContainsElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sample(1, 2, 5, 6);

	}

	public static void sample(int... element) {
		List lElements = Arrays.asList(element);
		for (int i = 0; i < 20; i++) {
			if (lElements.contains(i)) {
				System.out.println("Element " + i + " Contains");
			} else {
				System.out.println("Element " + i + "does not Contains");
			}

		}
	}
}
