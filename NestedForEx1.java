import java.util.Scanner;
public class NestedForEx1{
  public static void main(String args []){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1; i<= n; i++){
      for(int k =1; k<= n;k++){
        System.out.print(k + "" );
      }
      System.out.println();
    }
  }
}
