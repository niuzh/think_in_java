package ch10;

class WithInner{
	class Inner{}
}
//内部类的继承
public class InheritInner extends WithInner.Inner {
	public InheritInner(WithInner withInner) {
		withInner.super();
	}
	public static void main(String[] args) {
		WithInner withInner=new WithInner();
		InheritInner inheritInner=new InheritInner(withInner);
	}

}
