package innerclasses;

public class Parcel6 {
	/**
	 * 任意作用域内定义内部类
	 * @param b
	 */
	private void internalTracking(boolean b){
		if(b){
			System.out.println("任意作用域内定义内部类");
			class TrackingSlip{
				private String id;
				public TrackingSlip(String string) {
					id=string;
				}
			}
			TrackingSlip tSlip=new TrackingSlip("slip");
		}
		//超出作用域不可使用
		//TrackingSlip tSlip=new TrackingSlip("slip");
	}
	public void track() {
		internalTracking(true);
	}
	public static void main(String[] args) {
		Parcel6 parcel6=new Parcel6();
		parcel6.track();
	}

}
