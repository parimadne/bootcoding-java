import java.util.Scanner;
public class ForEx8{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    int temp=0;
    for(int i= 0; i<n; i++){

      temp= (temp * 10)+9;
      sum+=temp;
      System.out.print(temp+" ");
    }
    System.out.println(sum);
  }

}
