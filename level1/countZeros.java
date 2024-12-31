public class countZeros {
    public static void main(String[] args) {
        countZeros(3040201);
        System.out.println(count);
    }
    static int count = 0;
    public static int countZeros(int n){
        if(n == 0){
            return 0;
        }
        int rem = n%10; 
        //check rem== 0
        if(rem == 0){
             count = count +  1 ;
        }
        countZeros(n/10);
        return count;

    }
}
