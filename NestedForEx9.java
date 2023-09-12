import java.util.Scanner;
public class NestedForEx9{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
    for(int i = 1;i<=n;i++){
      for(int k =1;k<=n;k++){

        if(k<=n-i){
          System.out.print(" ");
        }else{
          System.out.print("*");
        }

      }
        for(int k=1; k<i; k++){
          System.out.print("*");
      }
          System.out.println(" ");

}
      for(int i = n;i>=1;i--){
        for(int k =1;k<=n;k++){

        if(k<=n-i){
          System.out.print(" ");
          }else{
          System.out.print("*");
      }

        }
  for(int k=1; k<i; k++){
    System.out.print("*");
  }
  System.out.println(" ");
}

  }

}
