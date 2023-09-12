import java.util.Scanner;
public class NestedForEx5{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
        int p = 1;
    for(int i =1; i<=n;i++){
      for(int k =1; k<=i; k++){

        System.out.print(p+" " );
        p++;
      }
      System.out.println(" ");

    }
  }
}
