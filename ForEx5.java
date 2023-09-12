import java.util.Scanner;
public class ForEx5{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int multi = 1;
    for(int y = n; y>0 ; y--){
      multi *=y ;
    }
        System.out.println(multi);


  }
}
