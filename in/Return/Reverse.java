package in.Return;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int r = sc.nextInt();
        int p = reversereturn(r);
        System.out.println("The reverse: " +p);
    }
    public static int reversereturn(int r){
        int n = 0;
        while(r!=0){
            int d= r/10;
            n= n * 10 + r % 10;
            r= d;
        }
        return n;
    }
}
