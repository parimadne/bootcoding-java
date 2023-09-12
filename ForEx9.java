import java.util.Scanner;
public class ForEx9{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum =0;
    int y = 0;
    for(int x = 0; x<n;x++){
      sum = sum + y;
      y = (y*10) + 1;
      System.out.print(y+" + ");
    }

    System.out.println("\n sum =" + sum);
  }
}
