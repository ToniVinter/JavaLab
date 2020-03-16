package com.company;

import java.util.Scanner;

public class FindName {
    private final String name;

    public FindName(String name) {
        this.name = name;
    }

    public int tryName(){
        Scanner scanner = new Scanner(System.in);
        String tryedName = scanner.nextLine();
        int count = 0;
        while(!tryedName.equals(name)){
            tryedName = scanner.nextLine();
            count++;
        }
        return count;
    }
}
