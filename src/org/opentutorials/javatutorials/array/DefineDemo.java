package org.opentutorials.javatutorials.array;

public class DefineDemo {
    // 배열은 연관된 데이터를 그룹핑해서 관리하기 위한 수단
    public static void main(String[] args) {
        //String[] classGroup = { "최진혁", "최유빈", "한이람", "이고잉" };
        // 배열의 선언과 초기화를 동시에 할 수 있다.
        // 배열의 선언은 데이터 타입 뒤에 []를 붙이고 변수명을 적는다.
        // 배열의 초기화는 중괄호 {}를 사용한다.
        // System.out.println(classGroup[0]);
        // // 배열의 인덱스는 0부터 시작한다.
        // System.out.println(classGroup[1]);
        // System.out.println(classGroup[2]);
        // System.out.println(classGroup[3]);

        String[] classGroup = new String[4];
        classGroup[0] = "최진혁";
        System.out.println(classGroup.length);
        classGroup[1] = "최유빈";
        System.out.println(classGroup.length);
        classGroup[2] = "한이람";
        System.out.println(classGroup.length);
        classGroup[3] = "이고잉";  
        System.out.println(classGroup.length);
        //length는 배열의 길이를 알려주는 속성
    }
}
