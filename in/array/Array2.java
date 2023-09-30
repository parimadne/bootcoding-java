package in.array;

public class Array2 {
    public static void main(String [] args) {
        int[] a = {5, 6, 7, 8, 9, 10};
        int ans= summation(a);
        int sub= subtraction(a);

        System.out.println(sub);
        System.out.print(ans);
    }
public static int summation(int[] arr){
        int sum = 0;
    for (int j : arr) {
        sum += j;
    }
       return sum;
    }
    public static int subtraction(int[] arr){
        int sub = 0;
        for (int j : arr) {
            sub -= j;
        }

        return Math.abs(sub);
    }
}
