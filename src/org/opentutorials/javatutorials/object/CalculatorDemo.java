package org.opentutorials.javatutorials.object;

class Calculator {//클래스
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void sum(){
        System.out.println(this.left+this.right);
    }
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
}
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();//인스턴스화
        //데이터타입 변수명 = new 데이터타입();
        
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
         
        Calculator c2 = new Calculator();
        c2.setOprands(20, 40);
        c2.sum();
        c2.avg();
    }
    
}
