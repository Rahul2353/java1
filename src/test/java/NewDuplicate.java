package a;



import java.util.ArrayList;

public class NewDuplicate {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList();
        list.add("Sagio Mane");
        list.add("Karius");
        list.add("Mo Salah");
        list.add("Firmino");
        list.add("Lovren");
        list.add("Steven Gerrard");
        list.add("Karius");
        list.add("Mo Salah");

    for(int i =0; i < list.size(); i++) {
         if (list.get(i).equals(list)) {
             System.out.println(list.get(i)+" is duplicated");
         }
    }
	}

}
