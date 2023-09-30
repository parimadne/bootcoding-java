package in.Method;
import java.util.Scanner;
public class Maxmin {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter First Number :");
            int n = sc.nextInt();
            System.out.println("Enter Second Number :");
            int m = sc.nextInt();
            Maximum(n,m);
            System.out.println("Enter Third Number :");
            int o = sc.nextInt();
            Minimum(n,m,o);
        }
        public static void Maximum(int n , int m){
            if(n>m){
                System.out.println(n+ " is the maximum number ");
            }else{
                System.out.println(m+ " is the maximum number ");
            }
        }
        public static void Minimum(int n , int m , int o){
            if(n<m && n<o){
                System.out.println(n+ " is the minimum number ");
            }else if(m>o){
                System.out.println(o+" is the minimum number ");
            }else{
                System.out.println(m+ " is the minimum number ");
            }
        }
}
