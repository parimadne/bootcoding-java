package in.array;

public class Array6 {
    public static void main(String[] args){
        int[] a ={10,15,20,25,35,75,80,95};
            value(a);
            System.out.println(" ");
            maximum(a);
           minimum(a);
    }
    public static void value(int[] arr){
        for (int j : arr) {
            if (j > 30 && j < 100) {
                System.out.print(j + " ");
            }
        }
    }
    public static void maximum(int[] b){
        int max = b[0];
        for (int j : b) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println(max);
    }
    public static void minimum(int[] b){
        int mini =b[0];
        for (int j : b) {
            if (j < mini) {
                mini = j;
            }
        }
      System.out.println(mini);
    }
}
