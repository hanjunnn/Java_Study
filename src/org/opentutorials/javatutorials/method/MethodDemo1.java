package org.opentutorials.javatutorials.method;

public class MethodDemo1 {
    // public static void numbering() { // numbering이라는 메소드를 정의
    //     int i = 0;
    //     while (i < 10) {
    //         System.out.println(i);
    //         i++;
    //     }
    // }
    // public static void numbering(int limit) {
    //     int i = 0;
    //     while (i < limit) {
    //         System.out.println(i);
    //         i++;
    //     }
    // }
    public static void numbering(int init, int limit) {
        int i = init;
        while (i < limit) {
            System.out.println(i);
            i++;
        }
    }
    public static void main(String[] args) { // main 메소드
        numbering(3,5); // numbering 메소드를 호출
    }
    //메소드를 사용함으로써 코드의 재활용성이 높아지고 코드량이 줄고, 유지보수가 쉬워진다.


}
