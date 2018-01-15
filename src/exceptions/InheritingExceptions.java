package exceptions;
class SimpleException extends Exception{}
public class InheritingExceptions {

	public void f() throws SimpleException{
		System.out.println("Throw SimpleException from f();");
		throw new SimpleException();
	}
	public static void main(String[] args) {
		InheritingExceptions sExceptions=new InheritingExceptions();
		try {
			sExceptions.f();
		} catch (SimpleException e) {
			System.out.println("Caught it!");
			e.printStackTrace();
		}
	}

}
