package strings;

public class Immutable {

	public static void main(String[] args) {
		String qString="howdy";
		System.out.println(qString);
		String qqString=upcase(qString);
		System.out.println(qqString);
		System.out.println(qString);
	}

	private static String upcase(String qString) {
		return qString.toUpperCase();
	}

}
