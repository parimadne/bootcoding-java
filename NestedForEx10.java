import java.util.Scanner;
public class NestedForEx10{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i =1;i<=n;i++){
      for(int p=1; p<=n-i; p++){
        System.out.print(" ");
      }
      for(int j=1; j<(i+i); j++){
        System.out.print("*");
      }
      System.out.println(" ");
    }

    for(int i =n-1;i>=1;i--){
      for(int p=1; p<=n-i; p++){
        System.out.print(" ");
      }
      for(int j=1; j<(i+i); j++){
        System.out.print("*");
      }
      System.out.println(" ");
    }
  }
}
