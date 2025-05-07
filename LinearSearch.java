package searchingalgorithms;

public class LinearSearch {

	private static int linearSearch(int[] arr, int target) {
		int n =arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		 int[] arr = {64, 34, 25, 12, 22, 11, 90};
	     int target = 25;
	     
	     int result=linearSearch(arr,target);
	     
	     if(result != -1) {
	    	 System.out.println("element at index "+result);
	     } else {
	    	 System.out.println("element not found");
	     }
	}
}
