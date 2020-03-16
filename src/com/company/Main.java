package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        CharFinder charFinder = new CharFinder(scanner.nextLine());
//        System.out.println(charFinder.countChars('a'));

        FindName findName = new FindName("John");
        System.out.println(findName.tryName());
    }
}
