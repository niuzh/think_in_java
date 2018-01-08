package ch10;

abstract class Base{
	public Base(int i) {
		System.out.println("Base constructor.i="+i);
	}
	public abstract void f();
}
/**
 * 匿名内部类构造器
 * @author niu
 *
 */
public class AnonymousConstructor {

	public static Base getBase(int i) {
		return new Base(i) {
			//通过实力初始化方法执行构造器行为
			{
				System.out.println("Inside instance initializer");
			}
			@Override
			public void f() {
				System.out.println("In anonymous f()");
			}
		};
	}
	public static void main(String[] args) {
		Base base=getBase(47);
		base.f();
	}

}
