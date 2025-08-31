import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double a = sc.nextDouble();

        System.out.println("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("Choose operation (+. - , *, /)");
        char op = sc.next().charAt(0);

        String result = switch (op){
          case '+' -> "result = " + (a + b);
          case '-' -> "result = " + (a - b);
          case '*' -> "result = " + (a * b);
          case '/' -> {
              if (b != 0)
                  yield "Result =" + (a / b);
               else
                   yield "Error: Division by zero!";
          }
            default -> "Invalid Operator";
        };
        System.out.println(result);
    }
}
