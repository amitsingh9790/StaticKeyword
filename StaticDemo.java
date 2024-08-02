package StaticKeyword;

public class StaticDemo {
    int a = 10;
    static int b = 20;
    static void m1(){
        //
    }
}
class Main{
    public static void main(String[] args) {
        StaticDemo obj = new StaticDemo();
        System.out.println(obj.a);
        System.out.println(StaticDemo.b);
    }
}