package org.opentutorials.javatutorials.example;
interface I{
    public void z();
}
class A implements I{//구현
    public void z(){}
}
//interface는 상속을 강제하는 효과가 있다.
//interface를 implements하는 클래스는 interface의 메소드를 모두 구현해야 한다.

//하나의 클래스가 여러개의 인터페이스를 구현할 수 있다.
interface I1{
    public void x();
}
interface I2{
    public void y();
}
class B implements I1, I2{
    public void x(){}
    public void y(){}
}
//interface도 상속이 가능하다.
interface I3{
    public void x();
}
interface I4 extends I3{
    public void z();
}
class C implements I4{
    public void x(){}
    public void z(){}
}

//interface의 멤버는 public이다.
//abstract와 interface의 차이점은 abstract는 추상 클래스이기 때문에 객체를 만들 수 있지만, 
//interface는 추상 메소드만을 가지고 있기 때문에 객체를 만들 수 없다.