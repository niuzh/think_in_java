package ch10;

/**
 * 创建内部类对象
 * @author niu
 *
 */
public class DotNew {
	public class Inner1{
		public Inner1() {
			System.out.println("Inner1");
		}
	}

	public static void main(String[] args) {
		//必须使用外部类的对象来创建内部类对象
		DotNew dotNew=new DotNew();
		DotNew.Inner1 inner=dotNew.new Inner1();
	}

}
