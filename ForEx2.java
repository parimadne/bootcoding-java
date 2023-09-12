import java.util.Scanner;
public class ForEx2{
public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
int sum = 0;
for(int x = 1; x<= n; x++){
sum = sum + x;
}
System.out.println(sum);
}
}
