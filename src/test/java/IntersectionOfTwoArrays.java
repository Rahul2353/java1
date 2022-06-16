package a;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		int[] x = { 1, 2, 5, 4, 3, 8,6 };
		int[] y = { 7, 8, 1, 5, 4, 9, 6 };

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < y.length; j++) {

				if (x[i] == y[j]) {
           //int temp=x[i];
					System.out.println(x[i]);
				}
			}
		}

	}
}
