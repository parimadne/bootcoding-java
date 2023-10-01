package in.array;

public class Array8 {
    public static void main(String[] args) {
        int[] a = {10, 15, 20, 25, 35, 75, 80, 95};
        for (int ele : a) {
            System.out.print(ele + " ");
        }
        int[] b = reverse(a);
            System.out.println("");
        for (int ele : b) {
            System.out.print(ele + " ");
        }
    }
        public static int[] reverse(int[] b ){
            int i=0;
            int j=b.length-1;
            while(i<=j){
                b[i]=b[i]^b[j];
                b[j]=b[i]^b[j];
                b[i]=b[i]^b[j];
                i++;
                j--;
            }
            return b;
        }
}
