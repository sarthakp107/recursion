
public class nTo1 {
    public static void main(String[] args) {
        printboth(5);
    }



static void print(int n) {
    System.out.println(n);
    if (n == 1) {
        return;
    }
    print(n - 1);
}

static void printRev(int n) {
    if (n == 0) {
        return;
    }
    print(n - 1);
    System.out.println(n);
}


//print 54321 12345
static void printboth(int n){
    if(n==0){
        return;
    }
    System.out.println(n);
    printboth(n-1);
    System.out.println(n);

}
}