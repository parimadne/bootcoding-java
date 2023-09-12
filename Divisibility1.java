import java.util.Scanner;
public class Divisibility1{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System .out.println("Enter any number:");
int n = sc.nextInt();
if(n%3==0 && n%5==0){
System.out.println(n+" is divisible by 3 & 5");
}else{
System.out.println(n+" is not divisible by 3 & 5");
}
}
}
