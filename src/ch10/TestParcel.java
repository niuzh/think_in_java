/**
 * 
 */
package ch10;

/**
 * 
 * @author niu
 *
 */

class Parcel4 {

	private class PContents implements Contents {
		private int i = 11;

		@Override
		public int value() {
			return i;
		}
	}

	protected class PDestination implements Destination {
		public PDestination(String whereTo) {
			lable = whereTo;
			System.out.println(lable);
		}

		private String lable;

		@Override
		public String readLable() {
			return lable;
		}
	}

	public Destination destination(String whereTo) {
		return new PDestination(whereTo);
	}

	public Contents contents() {
		return new PContents();
	}
}

public class TestParcel {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Parcel4 parcel4 = new Parcel4();
		Contents contents = parcel4.contents();
		Destination destination = parcel4.destination("Hello");
	}

}
