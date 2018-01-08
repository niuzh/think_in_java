package ch10;

/**
 * 匿名内部类构造器传递参数
 * @author niu
 *
 */
public class Parcel8 {
	public Wrapping wrapping(int x) {
		return new Wrapping(x){
			public int value() {
				return super.value()*47;
			}
		};
		//末尾加分号
	}
	public static void main(String[] args) {
		Parcel8 parcel8=new Parcel8();
		Wrapping wrapping= parcel8.wrapping(10);
		System.out.println(wrapping.value());

	}

}
