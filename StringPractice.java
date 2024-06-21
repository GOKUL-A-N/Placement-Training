public class StringPractice {
    public static void main(String[] args) {
        // numberOfSpecialCharacters("zfjbn2@#dkfnb#$%");
        // convertLowerCaseToUpperCase("Hello, world!");
        printOnlyNumbers("dbjn45n324");
    }

    static void numberOfSpecialCharacters(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetterOrDigit(s.charAt(i)))
                count++;
        }
        System.out.println(count);
    }

    static void convertLowerCaseToUpperCase(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                res += (char) (s.charAt(i) - 32);
            } else {
                res += s.charAt(i);
            }
        }
        System.out.println(res);
    }

    static void printOnlyNumbers(String str) {
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57)
                res = (res * 10) + ((int) str.charAt(i) - 48);
        }
        System.out.println(res);
    }
}