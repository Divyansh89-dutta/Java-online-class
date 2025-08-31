public class LShaped {
    public static void main(String[] args) {
        int l1 = 8, w1 = 4;
        int l2 = 4, w2=3;
        int o = 3;
        int area = (l1+w1)+(l2+w2);
        int perimeter = (2 * (l1 + w1)) + (2 * (l2 + 2)) - (2 * o);
        System.out.println("Area :" + area);
        System.out.println("Perimeter: "+ perimeter);
    }
}
