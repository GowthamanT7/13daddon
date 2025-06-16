package java_dsa;

import java.util.Scanner;

public class linsrh {
	int[] arr= {34,0,2,1,7,77,5,3,12,65,76,37,7};
	public void lin(int f) {
		int a=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==f) {
				System.out.println("value is found at "+i+" index");
				a++;
			}
		}
		if (a==0) {
			System.out.println("Value Not found");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		linsrh ls=new linsrh();
		System.out.println("Enter the Value:");
		int f=sc.nextInt();
		ls.lin(f);
	}
}
