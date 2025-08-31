public class triangle2 {
    public static void main(String[] args) {
        int a = 12, b = 3, c = 20;
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            int per = a + b + c;
            System.out.println("Triangle is valid.");
            System.out.println("Perimeter: " + per);
        } else {
            System.out.println("Triangle is nor valid");
        }
    }
}
