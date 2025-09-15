package methodbased;

public class q9 {
    public static boolean isPalindrome(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return str.equals(rev);
    }
    public static void main(String[] args) {
        System.out.println("MADAM is Palindrome? " + isPalindrome("MADAM"));
        System.out.println("HELLO is Palindrome? " + isPalindrome("HELLO"));
    }
}
