package innerclasses;

class Egg{
	public Egg() {
		System.out.println("Egg");
		y=new Yolk();
	}
	private Yolk y;
	protected class Yolk{
		public Yolk() {
			System.out.println("Egg.Yolk");
		}
	}
	
}
/**
 * 内部类覆盖
 * 没有用
 * @author niu
 *
 */
public class BigEgg extends Egg{

	public class Yolk{
		public Yolk() {
			System.out.println("BigEgg.Yolk");
		}
	}
	public static void main(String[] args) {
		new BigEgg();
	}

}
