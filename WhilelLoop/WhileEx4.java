package WhilelLoop;

import java.util.Scanner;

public class WhileEx4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n - 1;
            }
            p++;
        }
        System.out.println(p);
    }
}
