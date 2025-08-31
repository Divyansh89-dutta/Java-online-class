package StaticMethod;
class Test {
    static void showMessage() {
        System.out.println("Hello from static method!");
    }
}

public class main {
    public static void main(String[] args) {
        Test.showMessage();  // invoked using class name
    }
}

