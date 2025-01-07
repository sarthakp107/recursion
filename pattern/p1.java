//triangle 1

public class p1 {
    public static void main(String[] args) {
        printTriangle(4,0);
    }

    public static void printTriangle(int r, int c){
        if(r == 0){
            return;
        }
        
        if(c<r){
            printTriangle(r, c+1);
            System.out.print("*");
        }
        else{
            printTriangle(r-1, 0);
            System.out.println();
        }
    }
 

}
