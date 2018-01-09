package innerclasses;

public class Parcle2 {

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
	public Destination to(String string) {
		return new Destination(string);
	}
	public Contents contents() {
		return new Contents();
	}
	
	public void ship(String dest) {
		Contents contents=new Contents();
		Destination destination=new Destination(dest);
		System.out.println(destination.readLable());
	}
	public static void main(String[] args) {
		Parcle2 parcle1=new Parcle2();
		parcle1.ship("Tasmania");
		
		Parcle2 parcle2=new Parcle2();
		Parcle2.Contents contents=parcle2.contents();
		Parcle2.Destination destination=parcle2.to("Borneo");
	}

}
