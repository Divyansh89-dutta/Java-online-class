//package StaticMethod;
//class Test {
//    private Test() {}   // private constructor
//
//    static Test createObject() {   // factory method
//        return new Test();
//    }
//}
//
//public class Factory {
//    public static void main(String[] args) {
//        Test obj = Test.createObject();  // object created by factory method
//        System.out.println("Object created!");
//    }
//}
//
//Key Point:
//
//Use static when the method does not depend on object state.
//
//Use instance when method works with object data (fields).
//| **Type**     | **Keyword** | **Belongs To** | **How to Call**          |
//        | ------------ | ----------- | -------------- | ------------------------ |
//        | **Static**   | `static`    | Class          | `ClassName.methodName()` |
//        | **Instance** | none        | Object         | `object.methodName()`    |
//        | **Factory**  | `static`    | Class          | Returns object of class  |
