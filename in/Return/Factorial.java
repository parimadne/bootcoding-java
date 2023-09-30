package in.Return;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = factorialreturn(n);
        System.out.println("The factorial:" +f);
    }
    public static int factorialreturn(int n){
        int fact =1;
        for(int i = 1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }
}
