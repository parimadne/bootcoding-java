package in.Method;
import java.util.Scanner;
public class Largest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();
        System.out.println("Enter Third Number : ");
        int c = sc.nextInt();
        largest(a,b,c);
    }
    public static void largest(int a, int b, int c){
        if(a==b && b==c){
            System.out.println("All are equal");
        }else if(a==b){
            if(a>c){
                System.out.println("a & b are equal and largest");
            }else{
                System.out.println("a is largest but c and b are equal");
            }
        }else if(a==c){
            if(a>b){
                System.out.println("a & c are equal and largest");
            }else{
                System.out.println("b is largest but a and c are equal");
            }
        }else if(b==c){
            if(c>a){
                System.out.println("b & c are equal and largest");
            }else{
                System.out.println("c is largest but a and b are equal");
            }
        }else if(a>b && b>c){
            System.out.println("a is largest");
        }else if(b>c){
            System.out.println("b is largest");
        }else{
            System.out.println("c is largest");
        }
    }
}

