package org.opentutorials.javatutorials.condition;

public class SwitchDemo {
    public static void main(String[] args) {
        System.out.println("switch(1)");
        switch(1) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("default");
        }
        //switch문을 사용할 때 한가지 주의할 점은 몇가지 제한된 데이터 타입만 사용할 수 있다는 것
        //byte, short, char, int, enum, String, Character, Byte, Short, Integer
    }
}