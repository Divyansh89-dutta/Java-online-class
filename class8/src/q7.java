import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total price: ");
        double totalPrice = sc.nextDouble();
        double discount = 0;
        if (totalPrice >= 0 && totalPrice <= 5000){
            discount = 0;
        } else if (totalPrice >= 5000 && totalPrice <= 7000) {
            discount = 0.05;
        }else if (totalPrice >= 7000 && totalPrice <= 9000){
            discount = 0.10;
        } else if (totalPrice>9000) {
            discount = 0.20;
        } else {
            System.out.println("Invalid total price.");
            return;
        }
        double discountAmount = totalPrice * discount;
        double finalPrice = totalPrice - discountAmount;
        System.out.println("Discount Applied: " + (discount * 100) + "%");
        System.out.println("Discount Amount: ₹" + discountAmount);
        System.out.println("Final Price to Pay: ₹" + finalPrice);
    }
}
