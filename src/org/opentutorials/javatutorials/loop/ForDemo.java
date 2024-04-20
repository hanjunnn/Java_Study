package org.opentutorials.javatutorials.loop;

public class ForDemo {
    public static void main(String[] args){
        for(int i = 0; i < 10; i++){
            System.out.println("Coding Everybody"+i);
            //break는 반복문을 중단시키는 역할
            //continue는 반복문을 중단시키지 않고 다음 반복으로 넘어가게 하는 역할
        }
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.println(i+""+j);
            }
        }
    }
}
