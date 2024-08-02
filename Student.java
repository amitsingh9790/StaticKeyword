package StaticKeyword;

public final class Student{
    int num = 5;
    final void show1(){
        System.out.println(this.num);
    }
    void show2(){
    }
    void show1(int a){
    }
}

//class Child extends Student {
//    @Override
//    void show1() {
//    }
//
//    @Override
//    void show2() {
//
//    }
//}

class Mains {
    public static void main(String[] args) {
        final Student obj = new Student();
//        obj = new Student();
    }
}