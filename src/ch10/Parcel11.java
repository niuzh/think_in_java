package ch10;
/**
 * 嵌套类
 * 创建内部类不需要外围类对象
 * @author niu
 *
 */
public class Parcel11 {
	private static class ParcelContents implements Contents{
		private int i=11;
		@Override
		public int value() {
			return i;
		}
	}
	private static class ParcelDestination implements Destination {
		private ParcelDestination(String whereTo) {
			label=whereTo;
		}
		private String label;
		@Override
		public String readLable() {
			return label;
		}
	}
	public static Destination destination(String string) {
		return new ParcelDestination(string);
	}
	public static Contents contents() {
		return new ParcelContents();
	}
	public static void main(String[] args) {
		Contents contents=contents();
		Destination destination=destination("Tasmania");
	}

}
