package a;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayListProgramme {

	public static void main(String[] args) {

		// create an empty array list with an initial capacity
		List<Integer> arrlist = new ArrayList<Integer>();

		// use add() method to add elements in the list
		arrlist.add(15);
		arrlist.add(22);
		arrlist.add(40);
		arrlist.add(40);

		// adding element 25 at third position
		arrlist.add(2, 25);
		System.out.println(arrlist);

//		
//		List<Integer> a =arrlist.stream().distinct().collect(Collectors.toList());		
//			System.out.println(a);
//		}
//		

		List<Integer> Newlist = new ArrayList<Integer>();
		System.out.println(Newlist);
		for (Integer E : arrlist) {

			if (!Newlist.contains(E)) {
				Newlist.add(E);
			}
		//}
		//for (Integer A : Newlist) {
			

		}System.out.println(Newlist); 
		

	}
}
