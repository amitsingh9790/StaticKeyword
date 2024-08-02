package StaticKeyword;

public class A {
    static { //Static block class load hote hi execute ho jayega
        System.out.println("1");
    }
}
class B{
    static {
        System.out.println("2");
    }

    public static void main(String[] args) {
        A a = new A();
        System.out.println("3");
    }
}
