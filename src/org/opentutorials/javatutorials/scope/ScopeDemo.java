package org.opentutorials.javatutorials.scope;

public class ScopeDemo {
    static void a() {
        int i = 0;//유효범위 scope
    }
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            a();
            System.out.println(i);
        }
    } 
    // i는 a() 메소드에서 선언된 지역 변수이기 때문에 main() 메소드에서 사용할 수 없다.
}
