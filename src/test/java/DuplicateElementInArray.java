package a;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElementInArray {

	public static void main(String arg[]) {

		// create an empty array list with an initial capacity
		List<Integer> arrlist = new ArrayList<Integer>();

		// use add() method to add elements in the list
		arrlist.add(15);
		arrlist.add(22);
		arrlist.add(30);
		
		arrlist.add(30);
		// adding element 25 at third position
		arrlist.add(2, 25);

		List<Integer> newlist = new ArrayList<Integer>();
		System.out.println(newlist);
		for (Integer E : arrlist) {
			if (!newlist.contains(E)) {
              newlist.add(E);
			}
		}System.out.println(newlist);
	}
}
