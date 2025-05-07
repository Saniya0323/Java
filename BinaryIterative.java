package searchingalgorithms;

public class BinaryIterative {

	public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        
        while (low <= high) {
        	int mid=low+(high-low)/2;
        	
        	if(arr[mid]==target) {
        		return mid;
        	}else if(arr[mid]>target) {
        		high = mid-1;
        	}else {
        		low=mid+1;
        	}
        }
        return -1;        	
        }
	
	public static void main(String[] args) {
		 int[] arr = {11, 12, 22, 25, 34, 64, 90}; // Must be sorted
	        int target = 25;
	        
	        // Perform Binary Search
	        int result = binarySearch(arr, target);
	        
	        if (result != -1) {
	            System.out.println("Element found at index: " + result);
	        } else {
	            System.out.println("Element not found");
	        }
	}
}
