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
        // long a = 2147483648L;//int의 범위를 넘어선 값을 대입하려면 뒤에 L을 붙여야함
        // byte b = 100;//byte의 범위를 넘어선 값을 대입하려면 형변환 필요
    
        //형변환
        //데이터의 타입을 다른 데이터 타입으로 변환하는 것

        //자동 형변환
        //작은 데이터 타입에서 큰 데이터 타입으로 변환할 때 자동으로 형변환이 일어남
        //타입을 변경해도 데이터 손실이 없는 경우에만 일어남
        int a = 3;
        float b = 1.0F;
        double c = a+b;
    }
}