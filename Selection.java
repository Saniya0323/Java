package sorting_algorithms;

public class Selection{
	public static void selection(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			int minele = i;
			
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[minele]) {
					minele = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minele];
			arr[minele] = temp;
		}
	}
	
	public static void printSort(int arr[]) {
		for(int sort:arr) {
			System.out.print(sort+ " ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		int arr[]= {2,1,43,12,32};
		printSort(arr);
		selection(arr);
		printSort(arr);
	}
}