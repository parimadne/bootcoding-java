package WhilelLoop;

import java.util.Scanner;

public class WhileEx2 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n <= 20) {
      n++;
      if (n % 2 == 0) {
        System.out.println("The number is even " + n);

      }
    }
  }
}
