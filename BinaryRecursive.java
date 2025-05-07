package searchingalgorithms;

public class BinaryRecursive {
	

	private static int binarySearchRecursive(int[] arr, int target, int low, int high) {
		if(low<=high) {
			int mid = low+(high-low)/2;
			
			if(arr[mid]==target) {
				return mid;
			}else if(arr[mid] > target) {
				return binarySearchRecursive(arr,target,low, mid-1);
			}
			else {
				return binarySearchRecursive(arr,target,mid+1,high);
			}
		}
		return -1;
	}
	
	
	 public static void main(String[] args) {
	        int[] arr = {11, 12, 22, 25, 34, 64, 90}; // Must be sorted
	        int target = 22;
	        
	        // Perform Binary Search (Recursive version)
	        int result = binarySearchRecursive(arr, target, 0, arr.length - 1);
	        
	        if (result != -1) {
	            System.out.println("Element found at index: " + result);
	        } else {
	            System.out.println("Element not found");
	        }
	    }

}
