package generics;

public class Holder2 {
	private Object a;
	public Holder2(Object object) {
		this.set(object);
	}
	
	public Object get() {
		return a;
	}
	
	public void set(Object a) {
		this.a = a;
	}
	public static void main(String[] args) {
		Holder2 holder2=new Holder2(new Automobile());
		Automobile automobile=(Automobile)holder2.get();
		holder2.set("Not a Automobile");
		String string=(String)holder2.get();
		holder2.set(1);
		Integer xInteger=(Integer)holder2.get();
	}


}
