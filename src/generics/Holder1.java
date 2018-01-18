package generics;

class Automobile{}
public class Holder1 {
	private Automobile automobile;
	public Holder1(Automobile automobile) {
		this.automobile=automobile;
	}
	Automobile get(){
		return this.automobile;
	}
}
