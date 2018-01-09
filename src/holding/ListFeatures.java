package holding;

import java.util.List;
import java.util.Random;

import typeinfo.Hamster;
import typeinfo.Pet;
import typeinfo.Pets;

public class ListFeatures {

	public static void main(String[] args) {
		Random random=new Random(47);
		List<Pet> pets=Pets.arrayList(7);
		print("1"+pets);
		Hamster hamster=new Hamster();
		pets.add(hamster);
		print("2:"+pets);
		print("3："+pets.contains(hamster));
		pets.remove(hamster);
		Pet pet=pets.get(2);
	}
	static void print(String string){
		System.out.println(string);
	}
}
