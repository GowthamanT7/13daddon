package java_dsa;

import java.util.Arrays;

public class slcsrt {
	public static void bubbles(int a[]) {
		for(int i=1;i<a.length;i++) {
			for(int j=0;j<a.length-i;j++) {
				if(a[j+1]<a[j]) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					
				}
				System.out.println(Arrays.toString(a));
			}
			
		}
		//System.out.println(Arrays.toString(a));
	}
	public static void main(String[] args) {
		int[] arr= {23,3,7,44,55,2,9};
		bubbles(arr);
	}
}
