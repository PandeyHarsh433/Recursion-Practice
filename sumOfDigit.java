
public class sumOfDigit {
    static int digitSum(int n) {
        if(n==0) {
            return n;
        }
        return n%10 + digitSum(n/10);
    }
    public static void main(String[] args) {
        System.out.println(digitSum(3434));
    }
}
