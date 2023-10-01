package in.array;
public class Array5 {
    public static void main(String[] args){
        int[] a ={10,15,20,25,35,75,80,95};
        even(a);
        System.out.println("");
        reverse(a);
        }

    public static void even(int[] arr){
        for (int j : arr) {
            if (j % 2 == 0) {
                System.out.print(" " + j);
            }
        }
    }
    public static void reverse(int[] b){
            for(int j =b.length-1;j>=0;j--) {
                System.out.print(" " +b[j]);
            }
        }
    }



