package typeinfo;

import java.util.ArrayList;
import java.util.List;

public class Pets {
	public static List<Pet> arrayList(int size) {
		List<Pet> list=new ArrayList<>();
		for (int i = 0; i < size; i++) {
			list.add(new Pet());
		}
		return list;
	}
}
