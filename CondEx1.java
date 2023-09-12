import java.util.Scanner;
public class CondEx1{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number:");
      double a = sc.nextInt();
      System.out.println("Enter a number:");
      double b = sc.nextInt();
      if(a>b){
        System.out.println("a > b");
      }
      if(a<b){
        System.out.println("a < b");
      }
      if(a==b){
        System.out.println("a == b");
      }
    }
}
