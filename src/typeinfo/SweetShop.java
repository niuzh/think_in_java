package typeinfo;

class Candy{
	static{
		System.out.println("Loading Candy");
	}
}
class Gum{
	static{
		System.out.println("Loading Gum");
	}
}

class Cookie{
	static{
		System.out.println("Cookie Candy");
	}
}

public class SweetShop {

	public static void main(String[] args) {
		System.out.println("inside main");
		new Candy();
		System.out.println("after creating Candy");
		try {
			Class.forName("typeinfo.Gum");
		} catch (ClassNotFoundException e) {
			System.out.println("Couldn't find Gum");
		}
		System.out.println("after creating GUM");
		new Cookie();
		System.out.println("Couldn't find Cookie");

	}

}
