public class fibonacci {
    public static void main(String[] args) {
     
        int res = fibo(4);

    }

    public static int fibo(int n){
        //base condition
        if(n < 2){
            return n;
        }
        System.out.println(n);
        return fibo(n-1) + fibo(n-2);
    }
}
