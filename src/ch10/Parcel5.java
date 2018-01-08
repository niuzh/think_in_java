package ch10;

public class Parcel5 {
	/**
	 * 方法内定义内部类
	 * 方法返回接口类型，方法内部定义类，返回内部类对象
	 * @param string
	 * @return
	 */
	public Destination destination(String string){
		class PDestination implements Destination{
			private String lable;
			private PDestination (String whereTo){
				lable=whereTo;
				System.out.println(whereTo);
			}
			@Override
			public String readLable() {
				return lable;
			}
		}
		return new PDestination(string);
	}
	public static void main(String[] args) {
		Parcel5 parcel5=new Parcel5();
		Destination destination=parcel5.destination("Tasmania");
	}

}
