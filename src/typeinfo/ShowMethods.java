package typeinfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

public class ShowMethods {
	private static String usage = "usage:\n" + "to show all methods in class or:\n"
			+ "show methods qualified.calss.name word\n" + "to search for methods involving 'word'";
	private static Pattern p=Pattern.compile("\\w+\\.");
	public static void main(String[] args) {
		if(args.length<1){
			args=new String[1];
			args[0]=ShowMethods.class.getName();
		}
		try {
			Class<?> c=Class.forName(args[0]);
			Method[] methods=c.getMethods();
			Constructor[] ctors=c.getConstructors();
			for (Constructor constructor : ctors) {
				System.out.println(p.matcher(constructor.toString()).replaceAll(""));
			}
			for (Method method : methods) {
				System.out.println(p.matcher(method.toString()).replaceAll(" "));
			}
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		}
	}

}
