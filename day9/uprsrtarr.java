package java_dsa;

import java.util.Scanner;

public class uprsrtarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2, 3, 4, 5, 12, 24, 35, 77};
        int fst = 0;
        int lst = arr.length;
        int mid;
        
        System.out.println("Enter the number:");
        int f = sc.nextInt();

        while (fst < lst) {
            mid = (fst + lst) / 2;
            if (arr[mid]<= f) {
                fst = mid + 1;
            } else {
                lst = mid;
            }
        }

        if (fst==lst) {
            System.out.println("Upper bound index: " + fst + ", value: " + arr[fst]);
        }

        sc.close();
    }
}
