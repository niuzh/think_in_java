package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericVarargs {
	public static <T> List<T> makeList(T... args) {
		List<T> result=new ArrayList<>();
		for (T t : args) {
			result.add(t);
		}
		return result;
	}
	
	public static void main(String[] args) {
		List<String> lStrings=makeList("A");
		System.out.println(lStrings);
		lStrings=makeList("A","B","C");
		System.out.println(lStrings);
		System.out.println(lStrings);
		System.out.println(lStrings);
	}
}
