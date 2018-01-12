package holding;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ForEachCollections {

	public static void main(String[] args) {
		Collection<String> collection=new LinkedList<>();
		Collections.addAll(collection, "Take the long way home".split(" "));
		for (String string : collection) {
			System.out.print("'"+string+"' ");
		}
	}

}
