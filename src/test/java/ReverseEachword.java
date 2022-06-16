package a;

public class ReverseEachword {

	
	
	public static void main(String arg[]) {
		String str="Welcome to java";
		String[]words=str.split(" ");
		String rev="";
		//System.out.println(words);
		for(String w:words) {
			
		for(int i=w.length()-1;i>=0;i--) {
			
			
			rev=rev+w.charAt(i);
			
		}
			
			
		System.out.println(rev);
		}
		
	}
}
