package ch10;

class MNA{
	private void f() {
		
	}
	class A{
		private void g() {
			
		}
		public class B{
			void h(){
				f();
				g();
			}
		}
	}
}
/**
 * 多层嵌套访问外部类成员
 * @author niu
 *
 */
public class MultiNestingAccess {

	public static void main(String[] args) {
		MNA mna=new MNA();
		MNA.A a=mna.new A();
		MNA.A.B b=a.new B();
		b.h();
	}

}
