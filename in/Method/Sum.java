package in.Method;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: " );
        int n = sc.nextInt();
        System.out.println("Enter Second Number: " );
        int m = sc.nextInt();
        Add(n,m);
    }
    public static void Add(int n , int m){
        int o = m + n;
        System.out.println("The Addition: " +o);
    }
}
