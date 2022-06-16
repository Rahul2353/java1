package a;
import java.lang.reflect.Array;
import java.util.*;

public class ReverseArray {

	public static void main(String args[]) {
		
		String rev ="";
		String[] inputArray = { "India", "USA", "Germany", "Australia" };
         int len=inputArray.length;
		for (int i = len-1; i >= 0; i--) {
			rev=rev+inputArray[i];
		}
			System.out.println(rev );

	}

}
