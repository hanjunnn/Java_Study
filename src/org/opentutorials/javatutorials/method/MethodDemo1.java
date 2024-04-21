package org.opentutorials.javatutorials.method;

public class MethodDemo1 {
    public static void numbering() { // numbering이라는 메소드를 정의
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }
    public static void main(String[] args) { // main 메소드
        numbering(); // numbering 메소드를 호출
    }
}
