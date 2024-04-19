package org.opentutorials.javatutorials.operator;

public class ArithmeticDemo {
    public static void main(String[] args) {
        //연산자
        // int result = 1 + 2;
        // System.out.println(result);//3

        // result = result - 1;
        // System.out.println(result);//2

        // result = result * 2;
        // System.out.println(result);//4

        // result = result / 2;
        // System.out.println(result);//2

        // result = result + 8; //10
        // result = result % 7;
        // System.out.println(result);//3

        // //나머지 연산자
        // int a = 3;
        // System.out.println(0%a);//0
        // System.out.println(1%a);//1
        // System.out.println(2%a);//2
        // System.out.println(3%a);//0
        // System.out.println(4%a);//1
        // System.out.println(5%a);//2
        // System.out.println(6%a);//0

        // //+연산자는 문자열을 연결하는 연산자로도 사용됨
        // String firstString = "This is";
        // String secondString = " a concatenated string.";
        // String thirdString = firstString + secondString;
        // System.out.println(thirdString);//This is a concatenated string.

        //연산자 형변환
        int a = 10;
        int b = 3;

        float c = 10.0F;
        float d = 3.0F;

        System.out.println(a/b);//3
        //정수끼리만 연산하면 결과도 정수로 나옴
        System.out.println(c/d);//3.3333333
        System.out.println(a/d);//3.3333333
        //정수와 실수를 연산하면 결과는 실수로 나옴

        
    }
}
