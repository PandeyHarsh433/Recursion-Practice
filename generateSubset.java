
public class generateSubset {
    static void subsets(String str, String curr,int i) {
        curr = "";
        i = 0;
        if(i==str.length()) {
            System.out.println(curr);
            return;
        }
        subsets(str,curr,i+1);
        subsets(str,curr+str.charAt(i),i+1);

    }

    public static void main(String[] args) {
        subsets("Harsh", "", 0);
    }
}
