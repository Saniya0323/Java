package sorting_algorithms;

public class SelectionArray {
public static void main(String[] args) {
	
	String name[]= {"sam","peter","ron","harry","david"};
	
	for(int i=0; i<name.length-1;i++) {
		int min = i;
		
		for(int j=i+1;j<name.length;j++) {
			if(name[j].compareTo(name[min])<0)min = j;
		}
		String temp = name[min];
		name[min]=name[i];
		name[i] = temp;
	}
		
	for(String names:name) {
		System.out.print(names+" ");
	}
	
}
}
