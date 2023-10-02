package in.array;

public class Array11 {
    public static void main(String[] args) {
        int[] a = {10, 15, 22, 25,15};
        int[] b ={10 ,15, 20, 25, 35};
        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.println("");
        System.out.println(array(a));
        System.out.println(array(b));
    }

    public static boolean array(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

}
