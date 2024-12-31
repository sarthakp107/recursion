public class countZeros {
    // public static void main(String[] args) {
    //     countZeros(3040201);
    //     System.out.println(count);
    // }
    // static int count = 0;
    // public static int countZeros(int n){
    //     if(n == 0){
    //         return 0;
    //     }
    //     int rem = n%10; 
    //     //check rem== 0
    //     if(rem == 0){
    //          count = count +  1 ;
    //     }
    //     countZeros(n/10);
    //     return count;

    // }



    //more optimized solution




    public static void main(String[] args) {
       System.out.println(palind(505101));
    }

    static int palind(int n){
        return helper(n , 0 );
    }

    static int helper(int n , int c){
        if(n == 0 ){
            return c;
        }
        int rem = n%10;
        if(rem == 0){
            return helper(n/10, c+1);
        }
        return helper(n/10, c);
    }
}
