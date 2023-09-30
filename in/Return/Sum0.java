package in.Return;
import java.util.Scanner;
public class Sum0 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int n = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int m = sc.nextInt();
        addreturn(n,m);
        int p = addreturn(n,m);
        System.out.println(p);

    }
    public static int addreturn(int n , int m){
        int j = m + n;
        System.out.println("The Addition: " +j);
        return j;
    }
}
