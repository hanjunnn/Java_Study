package org.opentutorials.javatutorials.object;

class Calculator {// 클래스
    // static double PI = 3.14;//클래스 변수
    // static int base = 0;
    int left, right;
    int third = 0;

    // public Calculator(){}//기본 생성자를 사용해야함
    // public Calculator(int left, int right){
    // this.left = left;
    // this.right = right;
    // }

    // 오버로딩
    // 같은 이름의 메소드를 여러개 정의하는 것
    public void setOprands(int left, int right) {
        System.out.println("setOprands(int left, int right)");
        this.left = left;// 인스턴스 변수
        this.right = right;
    }

    public void setOprands(int left, int right, int third) {
        this.setOprands(left, right);
        System.out.println("setOprands(int left, int right, int third)");
        // this.left = left;// 인스턴스 변수
        // this.right = right;
        this.third = third;
    }

    public void sum() {
        System.out.println(this.left + this.right+this.third);
    }

    public void avg() {
        System.out.println((this.left + this.right + this.third) / 3);
    }

    // public static void sum(int left, int right){
    // System.out.println(left+right);
    // }
    // public static void avg(int left, int right){
    // System.out.println((left+right)/2);
    // }
}

class SubstractionableCalculator extends Calculator {
    public void sum() {
        System.out.println("실행결과는" + (this.left + this.right) + "입니다.");
    }

    // 오버라이딩을 할시 부모 메소드의 형식을 따라야 한다.
    // ex) 이름, 매개변수, 리턴타입 이를 통틀어 서명(signature)라고 한다.
    // public int avg() {
    //     return super.avg();
    // }

    // public SubstractionableCalculator(int left, int right){
    // super(left, right);
    // //초기화 코드는 super() 다음에 작성해야 한다.
    // }
    public void substract() {
        System.out.println(this.left - this.right);
    }
}

// class MultiplicationableCalculator extends Calculator{
// public void multiplication(){
// System.out.println(this.left * this.right);
// }
// }
// class DivisionableCalculator extends MultiplicationableCalculator{
// public void division(){
// System.out.println(this.left / this.right);
// }
// }
public class CalculatorDemo {
    public static void main(String[] args) {
        // Calculator c1 = new Calculator();//인스턴스화
        // 데이터타입 변수명 = new 데이터타입();
        // System.out.println(c1.PI);
        // SubstractionableCalculator c1 = new SubstractionableCalculator(10,20);
        // //c1.setOprands(10, 20);
        // c1.sum();
        // c1.avg();
        // c1.substract();
        // MultiplicationableCalculator c2 = new MultiplicationableCalculator();
        // c2.setOprands(10, 20);
        // c2.sum();
        // c2.avg();
        // c2.multiplication();
        // DivisionableCalculator c3 = new DivisionableCalculator();
        // c3.setOprands(10, 20);
        // c3.sum();
        // c3.avg();
        // c3.multiplication();
        // c3.division();

        // Calculator c2 = new Calculator();
        // System.out.println(c2.PI);
        // c2.setOprands(20, 40);
        // c2.sum();
        // c2.avg();

        // System.out.println(Calculator.PI);

        // Calculator.base = 10;

        // c1.sum();
        // c2.sum();
        // Calculator.sum(10, 20);
        // Calculator.avg(10, 20);

        // Calculator.sum(20, 40);
        // Calculator.avg(20, 40);

        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.setOprands(10, 20, 30);
        c1.sum();
        c1.avg();
    }

}
// 클래스 변수의 용도
// 클래스 변수는 인스턴스 변수와 달리 인스턴스마다 독립적이지 않고,
// 모든 인스턴스가 공유하는 값이 필요할 때 사용한다.
// 인스턴스를 생성할 필요가 없는 값을 클래스 변수로 선언하면 메모리를 절약할 수 있다.

// 상태를 공유할 필요가 없는 변수는 클래스 메소드로 선언한다.
// 클래스 메소드는 인스턴스 변수를 사용할 수 없다.
// 인스턴스 메소드는 클래스 변수를 사용할 수 있다.