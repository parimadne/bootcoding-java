package in.Return;
import java.util.Scanner;
public class Sum2 {
        public static void main(String [] args ){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number:");
            int a = sc.nextInt();
            System.out.println("Enter second number:");
            int b = sc.nextInt();
            System.out.println("Enter third number:");
            int c = sc.nextInt();
            Maxreturn(a,b,c);
            int m = Maxreturn(a,b,c);
            System.out.println("The maximum : " +m);
        }
        public static int Maxreturn(int a, int b , int c ){
            if(a>b && a>c){
                return a;
            }else if(b>a && b>c){
                return b;
            }else if(c>b && c>a){
                return c;
            }else{
                System.out.println(" Either all numbers are equal Or any two numbers are equal ");
                return 0;
            }

        }
}
