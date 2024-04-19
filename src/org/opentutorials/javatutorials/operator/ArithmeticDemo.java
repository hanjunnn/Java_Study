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
        // int a = 10;
        // int b = 3;

        // float c = 10.0F;
        // float d = 3.0F;

        // System.out.println(a/b);//3
        // //정수끼리만 연산하면 결과도 정수로 나옴
        // System.out.println(c/d);//3.3333333
        // System.out.println(a/d);//3.3333333
        // //정수와 실수를 연산하면 결과는 실수로 나옴

        // //단항 연산자
        // int i = 3;
        // i++;
        // System.out.println(i);//4
        // ++i;
        // System.out.println(i);//5
        // System.out.println(++i);//6
        // System.out.println(i++);//6
        // System.out.println(i);//7

        //연산자 우선순위
        int a = 4-3*6;
        //곱셈이 먼저 계산되므로 4-18=-14
    
        //boolean
        //참과 거짓을 나타내는 데이터 타입
        //비교연산자
        //==(같다), !=(다르다), >(크다), <(작다), >=(크거나 같다), <=(작거나 같다)
        //.equals()는 문자열을 비교할 때 사용하는 메소드
    }
}
