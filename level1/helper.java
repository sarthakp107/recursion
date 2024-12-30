public class helper {
    public static void main(String[] args) {
      rev(1234);
      System.out.println(sum);
    }

    static int sum = 0;
    static void rev(int n){
        if(n==0){
            return;
        }
        int lastElement = n%10;
        sum = sum *10 + lastElement;
        rev(n/10);

    }

    static int rev2(int n){
        int digits = (int)(Math.log10(n)) + 1;
        // return helper(n, digits);
    }
    
    // private static int helper(int n , int digits){

    // }



    
}
