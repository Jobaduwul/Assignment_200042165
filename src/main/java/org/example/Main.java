package org.example;

import assignment1.NextDateGenerator;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        NextDateGenerator nextDateGenerator = new NextDateGenerator(9, 4, 2020);
        nextDateGenerator.getNextDay(9,4,2020);
    }
}