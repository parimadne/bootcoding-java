package in.Return;
import java.util.Scanner;
public class Sum3 {
        public static void main(String [] args ){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any number:");
            int n = sc.nextInt();
            int c = cubereturn(n);
            System.out.println("The Summation Of Even Cube: " + c);

        }
        public static int cubereturn(int n ){
            int sum = 0;
            for(int i = 1; i<= n ; i++){
                if(i%2==0){
                   int cube = i*i*i;
                    sum += cube;
                }
            }
            return sum;

        }
}
