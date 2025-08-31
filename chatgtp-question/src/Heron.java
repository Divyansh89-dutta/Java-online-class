public class Heron {
    public static double heronArea(double a, double b, double c){
        if ((a + b > c) && (a + c > b) && (c + b > a)) {
            double s = (a+b+c)/2;
            double area = Math.sqrt(s * (s - a) * (s-b) * (s-c));
            return area;
        }else{
            System.out.println("Triangle is not valid.");
            return -1;
        }
    }

    public static void main(String[] args) {
        double a =7, b = 8, c = 9;
        double area = heronArea(a,b,c);
        if (area != -1){
            System.out.println("Area of triangle using Heron's Formula: "+ area);
        }
    }
}
