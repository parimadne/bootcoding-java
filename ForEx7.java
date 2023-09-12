import java.util.Scanner;
public class ForEx7{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double sum =0;
    for(double x = 1; x<=n ;x++){
      sum = sum + 1/x;
      System.out.print( + 1/x);
      if(x!=n) System.out.print(" + ");
    }
    System.out.println("\n the sum = " +sum);
  }
}
