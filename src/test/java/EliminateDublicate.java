package a;

import java.util.ArrayList;
import java.util.List;

public class EliminateDublicate {
	public static void main(String[] args) {
		
		
		int a[]= {4,6,4,9,7,9,3,4,6,7,2};
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			if (!list.contains(a[i])) {
				list.add(a[i]);
			}
		}System.out.println(list);
		
		
	}

}
