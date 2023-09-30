package in.Method;
import java.util.Scanner;
public class Hour {
    public static void main(String[] args){
        hour();
    }
    public static void hour(){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int min = 60;
        int sec = 3600;
        min = h * min;
        sec = h * sec;
        System.out.println("the minutes : " +min);
        System.out.println("the seconds : " + sec);
    }
}
