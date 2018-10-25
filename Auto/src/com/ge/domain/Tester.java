package com.ge.domain;

public class Tester {


    public static void main(String[] args) {
        Automobile ford = new Automobile(new Engine());
        Automobile chevy = new Automobile(new Engine());


        System.out.println("Ford " + ford);
        System.out.println("Chevy " + chevy);

        ford.pressStartStopButton();
        System.out.println("Ford " + ford);
    }
}
