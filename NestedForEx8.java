import java.util.Scanner;
public class NestedForEx8{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int p=1;
    for(int x=1;x<=n;x++){
      for(int k=1;k<=n;k++){
        if(k <= n-x){
          System.out.print("  ");
        }else{
        System.out.print(" "+ p + "  ");
        p++;
       }
      }
      System.out.println("  ");
    }
  }
}
