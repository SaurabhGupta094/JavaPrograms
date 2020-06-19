class SuperClass {
	public void method() {
		System.out.println("This is super method");
	}
}

public class ThisExample extends SuperClass {
	public void method() {
		
		System.out.println("This is Sub Method");

	}

	public static void main(String[] args) {
		ThisExample ex=new ThisExample();
		

		// TODO Auto-generated method stub

	}

}
