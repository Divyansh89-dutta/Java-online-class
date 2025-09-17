public class Main {

    // Method with var-args
    // "int... a" means we can pass multiple int values (like an array) without explicitly creating an array.
    public static void abc(int b, int... a) {
        // "b" will take the first argument
        // "a" will collect the remaining arguments into an array
        if (a.length > 0) {  // to avoid ArrayIndexOutOfBoundsException
            a[0] = 90; // modify the first element of var-args array
            System.out.println("First element of var-args changed to: " + a[0]);
        }
        System.out.println("Fixed argument b: " + b);
        System.out.println("Var-args length: " + a.length);

        // printing all elements of var-args
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // First argument goes to "b"
        // Remaining values go into the var-args array "a"
        abc(5, 7, 8, 9, 6, 54, 34);

        // You can also call with only one argument (var-args can be empty)
        abc(10);
    }
}
