import java.util.Scanner;
public class NestedForEx6{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1;i<=n;i++){
      for(int k=1;k<=n;k++){
        if(k<=n-i){
        System.out.print(" ");
      }else{
        System.out.print("*");
      }
    }
    System.out.println("");
    }
  }
}
