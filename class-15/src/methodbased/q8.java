package methodbased;

public class q8 {
    public static String reverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println("Reverse = " + reverse("JAVA"));
    }
}
