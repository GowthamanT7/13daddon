package java_dsa;
import java.util.Scanner;
import java.util.Arrays;
public class decnum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for (int i=0;i<=n-1;i++) {
			System.out.println("Enter the num");
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int[] arr2=arr;
		System.out.println(Arrays.toString(arr2));
		for(int i=0;i<n;i++) {
			for (int j=i+1;j<n;j++) {
				if(arr2[i]<arr2[j]) {
					int t=arr2[i];
					arr2[i]=arr2[j];
					arr2[j]=t;
				}
			}
		}
		System.out.println(Arrays.toString(arr2));
	}
}
