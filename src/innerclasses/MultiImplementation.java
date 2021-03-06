package innerclasses;

class D{}
abstract class E{}
class Z extends D{
	E makeE(){
		return new E(){};
	}
}
/**
 * 解决多重继承的问题
 * @author niu
 *
 */
public class MultiImplementation {
	static void tasksD(D d){}
	static void tasksE(E e){}
	public static void main(String[] args) {
		Z z=new Z();
		tasksD(z);
		tasksE(z.makeE());
	}

}
