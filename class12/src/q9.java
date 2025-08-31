public class q9 {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(0 + " " + 1);
        int secondPrev = 0, prev = 1;
        for (int i = 3; i <= n; i++) {
            int cur = prev + secondPrev;
            System.out.print(cur + " ");
            secondPrev = prev;
            prev = cur;
        }
    }
}
