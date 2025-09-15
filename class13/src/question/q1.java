package question;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String shape = sc.next().toLowerCase();
        switch (shape) {
            case "circle":
                double r = sc.nextDouble();
                double circleArea = Math.PI * r * r;
                System.out.println(circleArea);
                break;

            case "rectangle":
                double l = sc.nextDouble();
                double b = sc.nextDouble();
                double rectArea = l * b;
                System.out.println(rectArea);
                break;

            case "triangle":
                double base = sc.nextDouble();
                double h = sc.nextDouble();
                double triArea = 0.5 * base * h;
                System.out.println(triArea);
                break;

            default:
                System.out.println("Invalid shape");
        }
    }
}
