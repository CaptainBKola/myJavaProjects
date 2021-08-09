package ChapterThree;

public class isPaliandro {
    public static boolean isPaliandros(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            System.out.println(i);
            System.out.println(n);
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        System.out.println(isPaliandros("kolkol"));
    }

}
