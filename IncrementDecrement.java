public class IncrementDecrement{
public static void main(String[]args){
int x=6;
int y=4;
int a= ++x + ++y;
int b= x++ + ++y;
int c= x++ + y++;
int d= ++x + y++;
int f= x-- + --y;
int g= --x + --y;
int h= x-- + y++;
int i= ++x + --y;
System.out.println("A:"+a);
System.out.println("B:"+b);
System.out.println("C:"+c);
System.out.println("D:"+d);
System.out.println("F:"+f);
System.out.println("G:"+g);
System.out.println("H:"+h);
System.out.println("I:"+i);
}






}
