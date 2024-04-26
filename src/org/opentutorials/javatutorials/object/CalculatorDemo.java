package org.opentutorials.javatutorials.object;

class Calculator {//클래스
    static double PI = 3.14;//클래스 변수
    static int base = 0;
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;//인스턴스 변수
        this.right = right;
    }
    public void sum(){
        System.out.println(this.left+this.right+base);
    }
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
}
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();//인스턴스화
        //데이터타입 변수명 = new 데이터타입();
        System.out.println(c1.PI);
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
         
        Calculator c2 = new Calculator();
        System.out.println(c2.PI);
        c2.setOprands(20, 40);
        c2.sum();
        c2.avg();

        System.out.println(Calculator.PI);

        Calculator.base = 10;

        c1.sum();
        c2.sum();

    }
    
}
//클래스 변수의 용도
//클래스 변수는 인스턴스 변수와 달리 인스턴스마다 독립적이지 않고,
// 모든 인스턴스가 공유하는 값이 필요할 때 사용한다.
//인스턴스를 생성할 필요가 없는 값을 클래스 변수로 선언하면 메모리를 절약할 수 있다.