package innerclasses;

public class Parcel10 {

	public Destination destination(final String desc,final float price) {
		return new Destination() {
			private int cost;
			//实例初始化操作=构造器
			{
				cost=Math.round(price);
				if(cost>100){
					System.out.println("over budget");
				}
			}
			private String label=desc;
			
			@Override
			public String readLable() {
				return label;
			}
		};
	}
	public static void main(String[] args) {
		Parcel10 parcel10=new Parcel10();
		Destination destination=parcel10.destination("Tasmanis", 101.395F);
		System.out.println(destination.readLable());
	}

}
