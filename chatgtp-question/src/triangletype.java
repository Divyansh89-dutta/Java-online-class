public class triangletype {
    public static void main(String[] args) {
        int a = 10, b = 10, c = 10;
        if ((a + b > c) && (a + c > b) && (c + b > a)) {
            if (a == b && b == c){
                System.out.println("The triangle is Equilateral.");
            }else if (a==b || b==c || a==c){
                System.out.println("The triangle is Isosceles. ");
            }else{
                System.out.println("The given sides do not from valid triangle");
            }
        }
    }
}
