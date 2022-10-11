

public class palindrome {
    // static boolean checkpalin(String str, int s, int e) {
    //     if(s==e)
    //     return true;

    //     if(str.charAt(s)!=str.charAt(e))
    //     return false;

    //     if(s<e+1) {
    //         checkpalin(str, s+1, e+1);
    //     }
    //     return true;
    // }
    // static boolean isPalindrom(String str) {
    //     int n = str.length();

    //     if(n==0 || n==1) {
    //         return true;
    //     }
        
    //     return checkpalin(str, 0, n-1);
    // }
 
    
    static boolean isPlaindrome2(String str, int s, int e) {

        if(s>=e)
        return true;

        return((str.charAt(s)==str.charAt(e))&&isPlaindrome2(str, s+1, e-1));
    }
    public static void main(String[] args) {
        String t = "tnt";
        System.out.println(isPlaindrome2(t, 0, t.length()-1));
    }
}
