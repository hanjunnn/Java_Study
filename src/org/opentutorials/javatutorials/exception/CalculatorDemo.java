package org.opentutorials.javatutorials.exception;
class DivideException extends Exception {
    public int left;
    public int right;
    DivideException() {
        super();
    }
    DivideException(String message) {
        super(message);
    }
    DivideException(String message, int left, int right) {
        super(message);
        this.left = left;
        this.right = right;
    }
}
class Calculator {
    int left, right;

    public void setOprands(int left, int right) {
        // if(right == 0) {
        //     throw new IllegalArgumentException("두번째 인자의 값은 0이 될 수 없습니다.");
        // }
        this.left = left;
        this.right = right;
    }

    public void divide() throws DivideException {
        // try{
        //     if(this.right == 0) {
        //         throw new DivideException("0으로 나누는 것은 허용되지 않습니다.");
        //     }
        //     System.out.print(this.left/this.right);
        // } catch(DivideException e) {
        //     e.printStackTrace();
        // }

        if(this.right == 0) {
            throw new DivideException("0으로 나누는 것은 허용되지 않습니다.",this.left,this.right);
        }
        System.out.print(this.left/this.right);


        // 계산결과는 오류가 발생했습니다: / by zero
        // try {
        //     System.out.print("계산결과는  ");
        //     System.out.print(this.left / this.right);
        //     System.out.print(" 입니다.");
        // } catch (Exception e) {
        //     System.out.println("\n\ne.getMessage()\n" + e.getMessage());
        //     // e.getMessage()
        //     // / by zero
        //     System.out.println("\n\ne.toString()\n" + e.toString());
        //     // e.toString()
        //     // java.lang.ArithmeticException: / by zero
        //     System.out.println("\n\ne.printStackTrace()");
        //     e.printStackTrace();
        //     // e.printStackTrace()
        //     // java.lang.ArithmeticException: / by zero
        //     // at
        //     // org.opentutorials.javatutorials.exception.Calculator.divide(CalculatorDemo.java:12)
        //     // at
        //     // org.opentutorials.javatutorials.exception.CalculatorDemo.main(CalculatorDemo.java:26)
        // }
        // System.out.println("Divide End");
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        try {
            c1.divide();
        } catch (DivideException e) {
            System.out.println(e.getMessage());
            System.out.println(e.left);
            System.out.println(e.right);
        }
    }
}
