package in.array;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n= scan.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= scan.nextInt();
        }
        int ans = multiplication(arr);
        int sum = cubesum(arr);
        System.out.println(ans);
        System.out.print(sum);
    }
    public static int multiplication(int[] a){
        int multi = 1;
        for (int j : a) {
            multi *= j;
        }
        return multi;
    }
    public static int cubesum(int[] a){
        int sum = 0;
        for (int i : a) {
            sum += i * i * i;
        }
        return sum;
    }
}

