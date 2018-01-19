package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Frob{}
class Fnorkle{}
class Quark<Q>{}
class Particle<POSITION,MOMENTUM>{}

public class LostInformation {

	public static void main(String[] args) {
		List<Frob> list=new ArrayList<>();
		Map<Frob, Fnorkle> map=new HashMap<>();
		Quark<Fnorkle> quark=new Quark<Fnorkle>();
		Particle<Long,Double> particle=new Particle();
		System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(particle.getClass().getTypeParameters()));
		
	}

}
