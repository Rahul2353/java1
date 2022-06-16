package a;

public class CountOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Java Programing Java";
		char[] s2 = s1.toCharArray();
		int count = 0;
		System.out.println(s2);

		for (int i = 0; i <s2.length; i++) {

			if (s2[i] == 'a') {

				count++;
			}

		}
          System.out.println(count);
	}

}
