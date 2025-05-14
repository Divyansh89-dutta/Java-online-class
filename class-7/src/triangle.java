public class triangle {
    public static void main(String[] args) {
        double a = 5, b = 7, c = 9;
        double s = (a + b + c)/2;
        double area = Math.sqrt( s * (s-a)*(s-b)*(s-c));
        System.out.println(area);
    }
}
