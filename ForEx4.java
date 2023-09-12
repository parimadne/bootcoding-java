import java.util.Scanner;
public class ForEx4{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int multi = 1;
      for(int p =1; p <= 10; p++){
        multi = n * p;
        System.out.println(n+ " * " + p + " = " + multi);
      }

    }
}
