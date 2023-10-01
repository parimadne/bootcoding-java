package in.array;

public class Array7 {
    public static void main(String[] args) {
        int[] a ={10,15,20,25,35,75,80,95};
        for(int ele: a){
            System.out.print(ele+" ");
        }
         reverseArray(a);
        System.out.println("");

            for(int ele:a){
                System.out.print(ele+" ");
            }

    }

        public static int[] reverseArray(int[] a) {

            for(int i =0 ; i<a.length/2;i++){
              int temp = a[i];
              a[i]=a[a.length-1-i];
              a[a.length-1-i]= temp;
            }
            return a;
        }

}
