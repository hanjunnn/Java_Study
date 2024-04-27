package org.opentutorials.javatutorials.example;
abstract class A {
    public abstract int b();
    // 본체가 있는 메소드는 abstract 키워드를 가질 수 없다.
    //public abstract int c(){System.out.println("Hello");}
    // abstract 메소드는 객체를 만들 수 없다.
    // A obj = new A();
    // 추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재할 수 있다.
    public void d() {
        System.out.println("world");
    }
    
}
class B extends A {
    public int b() {
        return 1;
    }
}
//abstract는 상속을 강제하는 효과가 있다.
// 추상 클래스를 상속받는 클래스는 추상 클래스가 아니면 오버라이딩을 해야한다.

public class AbstractDemo {
    public static void main(String[] args) {
        //A obj = new A();
        B obj = new B();
    }
}
