package holding;

import java.util.HashMap;
import java.util.Map;

import typeinfo.Cat;
import typeinfo.Dog;
import typeinfo.Hamster;
import typeinfo.Pet;

public class PetMap {

	public static void main(String[] args) {
		Map<String, Pet> pMap=new HashMap<>();
		pMap.put("My Cat", new Cat());
		pMap.put("My Dog", new Dog());
		pMap.put("My Hamster", new Hamster());
		System.out.println(pMap);
		Pet dog=pMap.get("My Dog");
		System.out.println(dog);
		System.out.println(pMap.containsKey("My Dog"));
		System.out.println(pMap.containsValue(dog));
	}

}
