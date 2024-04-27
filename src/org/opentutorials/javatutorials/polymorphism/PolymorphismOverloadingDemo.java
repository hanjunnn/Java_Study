package org.opentutorials.javatutorials.polymorphism;
class O{
    public void a(int param){
        System.out.println("숫자 출력");
        System.out.println(param);
    }
    public void a(String param){
        System.out.println("문자 출력");
        System.out.println(param);
    }

}
// 다형성(Polymorphism)은 하나의 메소드나 클래스가 있을 때 이것들이 다양한 방법으로 동작하는 것을 의미한다.
// 오버로딩(Overloading)은 같은 이름의 메소드를 한 클래스 내에서 여러번 정의하는 것을 의미한다.
public class PolymorphismOverloadingDemo {
    public static void main(String[] args) {
        O o = new O();
        o.a(1);
        o.a("one");
    }    
}
