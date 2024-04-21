package org.opentutorials.javatutorials.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int i = sc.nextInt();
    //     System.out.println(i*1000);
    //     sc.close();
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     while(sc.hasNextInt()) {
    //         System.out.println(sc.nextInt()*1000);
    //     }
    //     sc.close();
    // }
    public static void main(String[] args) {
        try {
            File file = new File("out.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNextInt()) {
                System.out.println(sc.nextInt()*1000);
            }
            sc.close();
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}