package org.opentutorials.javatutorials.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class B {
    void run() throws FileNotFoundException, IOException {
        BufferedReader bReader = null;
        String input = null;
        bReader = new BufferedReader(new java.io.FileReader("out.txt"));
        input = bReader.readLine();

        System.out.println(input);
    }
}

class C {
    void run() throws FileNotFoundException, IOException {
        B b = new B();
        b.run();
    }
}

public class ThrowExceptionDemo {
    public static void main(String[] args) {
        C c = new C();
        try {
            c.run();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println("out.txt 파일이 필요합니다.");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
//throw를 이용해서 메인 메소드에서 예외를 처리하도록 할 수 있다.