package in.Return;
import java.util.Scanner;
public class Sum1 {

        public static void main(String [] args ){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any number:");
            int n = sc.nextInt();
            int s = Sumreturn(n);
            System.out.println("The Summation: " + s);

        }
        public static int Sumreturn(int n ){
            int sum = 0;
            for(int i = 1; i<= n ; i++){
                sum = sum + i;
            }
            return sum;

        }
}
