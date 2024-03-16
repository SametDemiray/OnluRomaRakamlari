package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> onlu = new ArrayList<>();
        List<String> roma = new ArrayList<>();
        roma.add("M");
        roma.add("CM");
        roma.add("D");
        roma.add("CD");
        roma.add("C");
        roma.add("XC");
        roma.add("L");
        roma.add("XL");
        roma.add("X");
        roma.add("IX");
        roma.add("V");
        roma.add("IV");
        roma.add("I");

        onlu.add(1000);
        onlu.add(900);
        onlu.add(500);
        onlu.add(400);
        onlu.add(100);
        onlu.add(90);
        onlu.add(50);
        onlu.add(40);
        onlu.add(10);
        onlu.add(9);
        onlu.add(5);
        onlu.add(4);
        onlu.add(1);

        int a, i = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pozitif Tamsayı : ");
        a = scanner.nextInt();
        System.out.printf("\nRoma Rakamları : ");

        while (a != 0) {
            while (a / onlu.get(i) != 0) {
                System.out.printf(roma.get(i));
                a -= onlu.get(i);
            }
            i++;
        }

    }
}