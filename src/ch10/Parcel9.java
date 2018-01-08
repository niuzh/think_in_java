package ch10;

/**
 * 初始化匿名内部类的字段
 * @author niu
 *
 */
public class Parcel9 {

	/**
	 * 参数引用必须是final
	 * TODO 不是fianl也可以？
	 * @param dest
	 * @return
	 */
	public Destination destination(String dest) {
		return new Destination() {
			private String label=dest;
			@Override
			public String readLable() {
				return label;
			}
		};
	}
	public static void main(String[] args) {
		Parcel9 parcel9=new Parcel9();
		Destination destination= parcel9.destination("Tasmania");
		System.out.println(destination.readLable());
	}

}
