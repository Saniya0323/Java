package sorting_algorithms;

public class Bubble {
	public static void bubble(int arr[]) {
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
	}
	public static void printSort(int arr[]) {
		for(int sort:arr) {
			System.out.print(sort+" ");
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		int arr[] = {12,1,3,11,4};
		printSort(arr);
		bubble(arr);
		printSort(arr);
		
	}
}
