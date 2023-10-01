package in.array;

public class Array10 {
    public static void main(String[] args) {
        int[] a= {10,15,20,25,35,75,80,95};
        finding(a);
    }
    public static void finding(int[] arr){
        for (int j : arr) {
            if (j == 80) {
                System.out.println("found");
                break;
            }
        }
    }
}
