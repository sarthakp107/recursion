
import java.util.ArrayList;



public class maze {
    public static void main(String[] args) {
        // System.out.println(pathCount(3,3));
        // path("" , 3,3);
        // System.out.println(pathRet("", 3, 3));
        // System.out.println(pathDiagnols("", 3, 3 ));
        // pathDiagnolsLetters("", 3, 3);
        System.out.println( pathDiagnolsLettersRet("", 3, 3));
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



    public static ArrayList<String> pathRet( String p,int row , int column){
        if(row == 1 && column == 1){
            ArrayList<String> ans= new ArrayList<>();
            ans.add(p);
            return ans;
        }

        ArrayList<String> list  = new ArrayList<>();

        if(row>1){
          list.addAll(pathRet(p + "D" , row-1, column));
        }
        if(column>1){
            list.addAll(pathRet(p + "R" , row, column -1));
        }
        return list;
    }

    public static int pathDiagnols(String p , int r  , int c){
        if(r== 1 || c ==1){
            return 1;
        }

        int left = pathDiagnols(p, r -1, c);
        int right = pathDiagnols(p, r , c - 1);
        int diagonal = pathDiagnols(p, r - 1, c -1);

        int ans = left + right + diagonal;

        return ans;
    }

    public static void pathDiagnolsLetters(String p , int r , int c){
        if(r == 1 &&c == 1){
            System.out.println(p);
            return;
        }

        if(r>1 && c>1){
            pathDiagnolsLetters(p + "d", r-1, c-1);
        }
        if(r> 1){
            pathDiagnolsLetters( p + "D", r-1, c);
        }
        if(c > 1){
            pathDiagnolsLetters( p + "R", r, c-1);
        }
    }


    public static ArrayList<String> pathDiagnolsLettersRet(String p , int r , int c){
        if(r == 1 &&c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        
        ArrayList<String> list = new ArrayList<>();

        if(r>1 && c>1){
            list.addAll(pathDiagnolsLettersRet(p + "d", r-1, c-1));
        }
        if(r> 1){
            list.addAll(pathDiagnolsLettersRet( p + "D", r-1, c));
        }
        if(c > 1){
            list.addAll(pathDiagnolsLettersRet( p + "R", r, c-1) );
        }
        return list;
    }



}
