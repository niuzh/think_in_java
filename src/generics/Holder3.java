package generics;

public class Holder3<T> {
	private T a;
	public Holder3(T a) {
		this.setA(a);
	}
	public static void main(String[] args) {
		Holder3<Automobile> holder3=new Holder3<Automobile>(new Automobile() );
		Automobile automobile=holder3.getA();
//		holder3.setA(1);
	}
	public T getA() {
		return a;
	}
	public void setA(T a) {
		this.a = a;
	}

}
