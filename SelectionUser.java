package sorting_algorithms;

import java.util.Scanner;

public class SelectionUser {
	public static void main(String[] args) {
		int arr[]= new int[5];
		int n=arr.length;
		
		System.out.println("enter 5 digits");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n-1;i++)arr[i]=sc.nextInt();
		
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
				 int temp = arr[min];
		            arr[min] = arr[i];
		            arr[i] = temp;
			}
		}
		for (int num : arr) System.out.print(num + " ");
	}

}
