package org.opentutorials.javatutorials.variables;

public class VariablesDemo {
    public static void main(String[] args) {
        // 데이터형식 변수명;
        // 정수
        // int a;
        // a = 1;
        // System.out.println(a+1);//2
        // a = 2;
        // System.out.println(a+1);//3

        // //실수
        // double b;
        // b = 1.1;
        // System.out.println(b+1.1);//2.2

        // 문자열
        // String first = "coding";
        // String a, b;
        // a = "coding";
        // b = "everybody";
        // System.out.println(a+b);

        //변수를 사용하는 이유
        //중복의 제거
        //가독성
        //유지보수

        //데이터 타입
        //메모리의 소모는 데이터 타입에 따라 다름
        //정수형
        //byte, short, int, long 주로 int 사용
        //실수형
        //float, double 주로 double 사용
        //문자형
        //char
        
        //상수는 변하지 않는 값을 의미
        long a = 2147483648L;//int의 범위를 넘어선 값을 대입하려면 뒤에 L을 붙여야함
        byte b = 100;//byte의 범위를 넘어선 값을 대입하려면 형변환 필요
    }
}