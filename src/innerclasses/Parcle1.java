package innerclasses;

public class Parcle1 {

	class Contents{
		private int i=11;
		public int value(){
			return i;
		}
	}
	class Destination{
		private String lable;
		public Destination(String whereTo) {
			lable=whereTo;
		}
		String readLable(){
			return lable;
		}
	}
	public void ship(String dest) {
		Contents contents=new Contents();
		Destination destination=new Destination(dest);
		System.out.println(destination.readLable());
	}
	public static void main(String[] args) {
		Parcle1 parcle1=new Parcle1();
		parcle1.ship("Tasmania");
	}

}
