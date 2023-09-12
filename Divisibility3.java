import java.util.Scanner;

public class Divisibility3{
  public static void main(String args[]){

    Scanner sc = new Scanner ( System.in);
    System.out.println("Enter any number:");

    int n = sc.nextInt();
    if(n%(3*3)==0){
      System.out.println(n+" is divisible by 9");
    }else{
      System.out.println(n+" is not divisible by 9 ");
    }
  }
}
