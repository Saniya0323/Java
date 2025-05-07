package sorting_algorithms;

public class Insertion {

	public static void insertion(int arr[]) {
		int n=arr.length;
		
		for(int i=0;i<n-1;i++) {
			int key=arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1]=key;
		}
	}
	
	public static void printArray(int[] arr) {
		for(int sort:arr) {
			System.out.print(sort+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr= {3,1,4,8,21};
		printArray(arr);
		insertion(arr);
		printArray(arr);
	}
	
}
