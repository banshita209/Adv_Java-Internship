package exception;

class MyException extends Exception {
	public MyException() {
		System.out.println("THIS IS MYEXCEPTION CONSTRUCTOR");
	}
}

public class Program2 {
	public static void main(String[] args) {

		try {
			throw new MyException();
		} catch (MyException e) {
			e.printStackTrace();
			System.out.println("We caught the Exception.");
		}
	}

}
