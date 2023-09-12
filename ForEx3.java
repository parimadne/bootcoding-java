import java.util.Scanner;
public class ForEx3{
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int sum = 0;
      for(int x = 0 ;x<= n; x=x+2){

          sum = sum + x;

      }
        System.out.println(sum);


   }
}
