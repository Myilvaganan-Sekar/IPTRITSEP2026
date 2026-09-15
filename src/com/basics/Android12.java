package com.basics;

public class Android12{

    public static void versionEight(int num) {
        System.out.println("New Version  ");
    }

    public static void main(String[] args) {
        System.out.println(Android11.abc);
        versionEight(10);
        Android11.versionEight(20);
    }
}
