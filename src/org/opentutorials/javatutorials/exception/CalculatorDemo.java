package org.opentutorials.javatutorials.exception;

class Calculator {
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void divide() {
        // 계산결과는 오류가 발생했습니다: / by zero
        try {
            System.out.print("계산결과는 ");
            System.out.print(this.left / this.right);
            System.out.print(" 입니다.");
        } catch (Exception e) {
            System.out.println("\n\ne.getMessage()\n" + e.getMessage());
            // e.getMessage()
            // / by zero
            System.out.println("\n\ne.toString()\n" + e.toString());
            // e.toString()
            // java.lang.ArithmeticException: / by zero
            System.out.println("\n\ne.printStackTrace()");
            e.printStackTrace();
            // e.printStackTrace()
            // java.lang.ArithmeticException: / by zero
            // at
            // org.opentutorials.javatutorials.exception.Calculator.divide(CalculatorDemo.java:12)
            // at
            // org.opentutorials.javatutorials.exception.CalculatorDemo.main(CalculatorDemo.java:26)
        }
        System.out.println("Divide End");
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        c1.divide();
    }
}
