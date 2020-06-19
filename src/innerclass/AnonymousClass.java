package innerclass;

interface Outer {
	public void show();
}

public class AnonymousClass implements Outer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o = new Outer() {
			@Override
			public void show() {
				// TODO Auto-generated method stub
					System.out.println(" Show it down:");
			}
		};
		o.show();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

}
