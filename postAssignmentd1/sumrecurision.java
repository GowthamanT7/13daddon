package java_dsa;
import java.util.Scanner;
public class sumrecurision {
	public static int add(int n) {
		if (n==0) {
			return 0;
		}
		return n%10+add(n/10);
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num;
	System.out.println("enter the numbers");
	num=sc.nextInt();
	int num3=add(num);
	System.out.println(num3);
	}
}
