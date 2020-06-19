package innerclass;

public class InnerClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass oc = new OuterClass();
		oc.outerShow();
		OuterClass.InnerClass ic = new OuterClass.InnerClass();
		ic.innerShow();

	}

}

class OuterClass {
	static int i = 10;

	public void outerShow() {
		System.out.println("i = " + i);
	}

	static class InnerClass {
		int j = 12;

		public void innerShow() {
			System.out.println("i = " + i);
			System.out.println("j = " + j);
		}
	}
}
