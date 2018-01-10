package holding;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetOfInteger {

	public static void main(String[] args) {
		Random random=new Random(47);
		Set<Integer> set=new HashSet<>();
//		for (int i = 0; i < Integer.MAX_VALUE; i++) {
		for (int i = 0; i < 10000; i++) {
			set.add(random.nextInt(30));
		}
		System.out.println(set);
	}

}
