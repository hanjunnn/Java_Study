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
    // public static void numbering(int init, int limit) {
    //     int i = init;
    //     while (i < limit) {
    //         System.out.println(i);
    //         i++;
    //     }
    // }
    public static String numbering(int init, int limit) {
        int i = init;
        //만들어지는 숫자들을 output이라는 변수에 담기 위해서 변수에 빈 값을 주었다.
        String output = "";
        while (i < limit) {
            //숫자를 화면에 출력하는 대신 변수 output에 담았다.
            output += i;
            i++;
        }
        //output에 담겨 있는 문자열을 외부로 반환하려면 아래와 같이 return을 사용하면 된다.
        return output;
    }
    public static void main(String[] args) { // main 메소드
        // numbering(3,5); // numbering 메소드를 호출
        String result = numbering(1,5);
        System.out.println(result);
    }
    //메소드를 사용함으로써 코드의 재활용성이 높아지고 코드량이 줄고, 유지보수가 쉬워진다.


}
