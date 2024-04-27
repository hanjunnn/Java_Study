package org.opentutorials.javatutorials.finalpkg;
//final은 상속/변경을 금지한다.
class A{
    final void b(){}
}
class B extends A{
    //void b(){}
}

final class C{
 final void b(){}   
}
//class D extends C{

