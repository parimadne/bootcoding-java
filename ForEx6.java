import java.util.Scanner;
public class ForEx6{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int square = 0;
    for(int x = 1; x <= n; x= x + 2){

        square = x*x;

      System.out.println(square);
    }
  }
}
