
public class sumOfDigits {
    public static void main(String[] args) {
        int ans = sumOfDigits(1342);
        System.out.println(ans);
    }

    static int sumOfDigits(int n){
        if(n == 0){
            return  0 ;
        }
int rem = n/10;
        return sumOfDigits(rem) + n%10;
    }
}
