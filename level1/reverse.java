
public class reverse {
    public static void main(String[] args) {
       reverseNumber(1824);
       System.out.println(sum);


    }

    static int sum = 0;

    static void reverseNumber(int n) {
        if (n == 0) {
            return ;
        }

        int rem = n % 10;
        sum = sum * 10 + rem;
        reverseNumber(n/10);
    }
}
