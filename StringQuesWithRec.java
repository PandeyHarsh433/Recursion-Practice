public class StringQuesWithRec {

    static void skipOneChar(String str, int i) {

        if (str.length() == 0) {
            System.out.println(str);
        }

        if (i == str.length() - 1 || i == str.length()) {
            return;
        }
        System.out.print(str.charAt(i));
        skipOneChar(str, i + 2);
    }

    

    public static void main(String[] args) {
        String str = "Subsequent";
        skipOneChar(str, 0);
    }
}
