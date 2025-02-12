

public class maze {
    public static void main(String[] args) {
        // System.out.println(pathCount(3,3));
        path("" , 3,3);
    }

    public static int pathCount(int row, int column){
        if(row ==1 || column == 1){
            return 1;
        }

        int left =  pathCount(row-1, column);
        int right = pathCount(row, column - 1);
        int ans = left + right;

        return ans;
    }

    public static void path( String p,int row , int column){
        if(row == 1 && column == 1){
            System.out.println(p);
            return;
        }

        if(row>1){
            path(p + "D" , row-1, column);
        }
        if(column>1){
            path(p + "R" , row, column -1);
        }
    }
}
