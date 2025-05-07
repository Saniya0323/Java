package sorting_algorithms;

public class BubbleString {
	public static void main(String[] args) {
	String names[]= {"sam","peter","ron","harry","david"};
	
	for(int i=0; i<names.length-1;i++) {
		int min = i;
		for(int j=0; j<names.length-1-i;j++) {
			if(names[j].compareTo(names[j+1])>0) {
				String temp = names[j];
				names[j]=names[j+1];
				names[j+1]=temp;
			}
		}
	}
	for(String name:names)System.out.print(name+" ");
	}
	}