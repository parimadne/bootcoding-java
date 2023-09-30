package in.array;
import java.util.Scanner;
public class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        even(arr);
        odd(arr);
    }

    public static void even(int[] a) {
        for (int j : a) {
            if (j % 2 == 0) {
                System.out.println("even: " + j);
            }
        }
    }
    public static void odd(int[] b){
        for (int j : b) {
            if (j % 2 != 0) {
                System.out.println("odd: " + j);
            }
        }
    }
}