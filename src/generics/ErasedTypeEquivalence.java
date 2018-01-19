package generics;

import java.util.ArrayList;

public class ErasedTypeEquivalence {

	public static void main(String[] args) {
		Class class1=new ArrayList<String>().getClass();
		Class class2=new ArrayList<Integer>().getClass();
		System.out.println(class1);
		System.out.println(class2);
		System.out.println(class1==class2);
	}

}
