public class palindrome {
    public static void main(String[] args) {
    //    rev(1234); 
       System.out.println(palin(121));
    }    

    static int sum = 0;
    public static int rev(int n){
        if(n == 0){
            return 0;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        rev(n/10);
        return sum;
    }

    public static boolean palin(int n){
      return n == rev(n);
    }
}
