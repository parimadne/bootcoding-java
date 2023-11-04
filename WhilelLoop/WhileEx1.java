package WhilelLoop;

import java.util.Scanner;

public class WhileEx1 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int org = n;
    int r = 0;
    while (n != 0) {
      int d = n / 10;
      r = r * 10 + n % 10;
      n = d;
    }
    System.out.println("number: " + org);
    System.out.println("palindrom number: " + r);
    if (n == r) {
      System.out.print(org + " The number is palindrom");
    } else {
      System.out.print(org + " The number is not palindrom");
    }
  }
}
