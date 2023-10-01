package in.array;
public class Array9 {
    public static void main(String[] args) {
        int[] a = {10, 15, 20, 25, 35, 75, 80, 95};
        int[] arr = {10, 15, 20, 25, 35, 75, 80, 95};
        for (int ele : a) {
            System.out.print(ele + " ");
        }
        int[] b = swap(a);
            System.out.println("");
        for(int ele: b) {
            System.out.print(ele+" ");
        }
        int[] c = swap3(arr);
        System.out.println("");
        for(int ele : c){
            System.out.print(ele+" ");
    }
    //swapping first no. with last no.
    }
    public static int[] swap(int[] b) {
        int temp = b[0];
        b[0] = b[b.length - 1];
        b[b.length - 1] = temp;
        return b;
    }
    // swapping first three no. with last three no.
    public static int[] swap3(int[] c){
        for(int i =0 ; i<3;i++){
            int temp = c[i];
            c[i]=c[c.length-1-i];
            c[c.length-1-i]= temp;
        }
        return c;
    }
}
