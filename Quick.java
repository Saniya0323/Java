package sorting_algorithms;

public class Quick {

	public static void quicksort(int[]arr, int low,int high) {
		if(low<high) {
			int pi=partition(arr,low,high);
			
			quicksort(arr,low,pi-1);
			quicksort(arr,pi+1,high);
		}
	}
	
	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i=low-1;
		
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				
				int temp=arr[i];
				arr[i] = arr[j];
				arr[j]=temp;
			}
		}
		
		int temp = arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return i+1;
	}

	public static void printArray(int[] arr) {
        for (int sort:arr) {
            System.out.print(sort + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        
        System.out.println("Original array:");
        printArray(arr);
        
        quicksort(arr, 0, arr.length - 1);
        
        System.out.println("Sorted array:");
        printArray(arr);
    }
    
}
