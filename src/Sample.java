
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Saurabh";
		byte[] bytes = str.getBytes();
		for (int i = 0; i < bytes.length; i++) {
			byte b = bytes[i];
			System.out.println((char)b);
			
		}

	}

}
