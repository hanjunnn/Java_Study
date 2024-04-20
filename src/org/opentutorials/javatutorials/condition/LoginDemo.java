package org.opentutorials.javatutorials.condition;

public class LoginDemo {
    public static void main(String[] args) {
        // String id = args[0]; //입력값을 받아옴
        // if(id.equals("egoing")){ //id가 egoing이면
        //     System.out.println("right");
        // } else {
        //     System.out.println("wrong");
        // }
        // String id = "egoing";
        // String password = "111111";
        // if (id.equals("egoing")) {
        //     if (password.equals("111111")) {
        //         System.out.println("right");
        //     } else {
        //         System.out.println("wrong");
        //     }
        // } else {
        //     System.out.println("wrong");
        // }
        String id = "egoing";
        String password = "111111";
        if (id.equals("egoing") && password.equals("111111")) {
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }
    }
}
