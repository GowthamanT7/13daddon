package java_dsa;

import java.util.Arrays;
import java.util.Scanner;

public class binsrh {
	int[] arr= {1,23,53,62,21,11,9,40,7,9};
	int fst=0;
	int lst=arr.length-1;
	public void bi(int f) {
		Arrays.sort(arr);
		int mid=(fst+lst)/2;
		if(arr[mid]==f) {
			System.out.println(Arrays.toString(arr));
			System.out.println("the element found at "+mid+" index");
		}
		else {
			if(arr[mid]<f) {
				fst=mid+1;
				bi(f);
			}
			else {
				lst=mid-1;
				bi(f);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		binsrh b=new binsrh();
		System.out.println("Enter the number:");
		int f=sc.nextInt();
		b.bi(f);
	}
}
