public class patternWithRec {

    static void trianglePattern(int row, int col) {
        if(row==0) {
            return;
        }
        if(col<row) {
            System.out.print("*");
            trianglePattern(row, col+1);
        }
        else {
            System.out.println();
            trianglePattern(row-1, 0);
        }
    }

    static void trianglePattern2(int row, int col) {
        if(row==0) {
            return;
        }
        if(col<row) {
            trianglePattern2(row, col+1);   
            System.out.print("*");
        }
        else {
            trianglePattern2(row-1, 0);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        trianglePattern(4,0);                   
        trianglePattern2(4,0);                   
    }
}
