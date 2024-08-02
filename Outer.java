package StaticKeyword;
//With static keyword
public class Outer {
    static class Inner{
        void show(){
            System.out.println("inside Inner class");
        }
    }
}
class NestedMain{
    public static void main(String[] args) {
        Outer.Inner ob = new Outer.Inner();
        ob.show();
    }
}

//With static keyword with static Method
//public class Outer {
//    static class Inner{
//        static void show(){
//            System.out.println("inside Inner class");
//        }
//    }
//}
//class NestedMain{
//    public static void main(String[] args) {
//        Outer.Inner.show();
//    }
//}

//Without static keyword
//public class Outer {
//    class Inner{
//        void show(){
//            System.out.println("Inside Inner Class");
//        }
//    }
//}
//class NestedMain {
//    public static void main(String[] args) {
//        Outer obj1 = new Outer();
//        Outer.Inner obj2 = obj1.new Inner();
//        obj2.show();
//    }
//}
