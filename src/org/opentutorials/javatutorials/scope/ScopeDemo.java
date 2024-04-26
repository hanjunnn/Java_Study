package org.opentutorials.javatutorials.scope;

public class ScopeDemo {
    // static void a() {
    //     int i = 0;//유효범위 scope
    // }
    // public static void main(String[] args) {
    //     for (int i = 0; i < 5; i++) {
    //         a();
    //         System.out.println(i);
    //     }
    // } 
   
    // // i는 a() 메소드에서 선언된 지역 변수이기 때문에 main() 메소드에서 사용할 수 없다.
    // static int i;//전역변수
    // static void a() {
    //     i = 0;
    // }
    // public static void main(String[] args) {
    //     for (i = 0; i < 5; i++) {
    //         a();
    //         System.out.println(i);
    //     }
    // }
    // //무한루프에 빠지게 된다.

    // static void a() {
    //     String title = "coding everybody";
    // }
    // public static void main(String[] args) {
    //     a();
    //     // System.out.println(title);
    //     // title은 a() 메소드에서 선언된 지역 변수이기 때문에 main() 메소드에서 사용할 수 없다.
    // }
    // public static void main(String[] args) {
    //     for (int i = 0; i < 5; i++) {
    //         System.out.println(i);
    //     }
    //     // System.out.println(i);
    //     // i는 for문에서 선언된 지역 변수이기 때문에 for문이 끝나면 사용할 수 없다.
    // }
    static int i = 5;
    static void a() {
        int i = 10;
        b();
    }
    static void b() {
        int i = 20;
        System.out.println(i);
    }
    public static void main(String[] args) {
        a();
    }
}
