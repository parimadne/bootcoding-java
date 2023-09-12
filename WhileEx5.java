import java.util.Scanner;
  public class WhileEx5{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int r = 0;
      int p = 0;
      while(n!=0){
        int d = n/10;
        r = r * 10 + n/10;
        n = d;
        p++;
      }
      if(p%2==0){
        System.out.println("p is a even number of digits: " + p);
      }else{
          System.out.println("p is a odd number of digits: " + p);
      }
    }
  }
