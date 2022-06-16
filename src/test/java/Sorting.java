package a;


public class Sorting {
	//Bubble sort
	
	public static void main(String args[]) {
		int temp=0;
		int arr[]= {4,5,7,6,9,1,2,8};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				//Swap
				
				
			}System.out.print(arr[i]);
			
		}
		
		
		
	}
	

}


