package innerclasses;

class Egg2{
	protected class Yolk{
		public Yolk() {
			System.out.println("Egg.Yolk");
		}
		public void f() {
			System.out.println("Egg.Yolk.f()");
		}
	}
	private Yolk y;
	public Egg2() {
		System.out.println("Egg");
		y=new Yolk();
	}
	public void insertYolk(Yolk yolk) {
		this.y=yolk;
	}
	public void g() {
		y.f();
	}
}
/**
 * 内部类覆盖
 * 继承内部类有用
 * @author niu
 *
 */
public class BigEgg2 extends Egg2{

	public class Yolk extends Egg2.Yolk{
		public Yolk() {
			System.out.println("BigEgg.Yolk");
		}
		public void f() {
			System.out.println("BigEgg.Yolk.f()");
		}
	}
	public BigEgg2() {
		insertYolk(new Yolk());
	}
	public static void main(String[] args) {
		BigEgg2 egg2= new BigEgg2();
		egg2.g();
	}

}
