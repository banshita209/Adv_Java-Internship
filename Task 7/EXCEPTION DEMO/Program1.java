package exception;

public class Program1 {

	public static void main(String[] args) {

		int a = 5, b = 0;

		try {
			int c = a / b;
		} catch (Exception e) {
			
			System.out.println(e);
		}finally {
			System.out.println("THIS BLOCK FINALLY BLOCK");
		}
	}

}
