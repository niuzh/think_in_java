package strings;

public class Replacing {
	static String string=Splitting.knights;
	
	public static void main(String[] args) {
		System.out.println(string.replaceFirst("f\\w+", "located"));
		//或表达式
		System.out.println(string.replaceFirst("shrubbery|tree|herring", "banana"));
	}

}
