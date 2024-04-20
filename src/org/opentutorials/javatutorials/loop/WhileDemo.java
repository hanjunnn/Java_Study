package org.opentutorials.javatutorials.loop;
public class WhileDemo {
    public static void main(String[] args){
        //다음은 무한 루프를 만드는 예제이다. 콘솔에서 실행할 경우 Ctrl + C를 눌러서 강제로 종료시킬 수 있다.
        // while(true){
        //     System.out.println("Coding Everybody");
        // }
        int i = 0;
        while(i < 10){
            System.out.println("Coding Everybody"+i);
            i++;
        }
    }
}
