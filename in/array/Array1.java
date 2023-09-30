package in.array;

public class Array1 {
        public static void main(String[] args){
            int[] a= {5,22,121,232,91,41};
            isPalindrome(a);
        }
        public static void isPalindrome(int[] arr){
            for (int a : arr) {
                boolean palindrome = palindrome(a);
                if (palindrome) {
                    System.out.println(a);
                }
            }
        }

        //test
        public static boolean palindrome(int n){
            int org= n;
            int r =0;
            while(n!=0){
                r = r * 10 + n % 10;
                n= n/10;
            }
            return r == org;
        }
}

