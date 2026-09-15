package com.basics;

public class Cricket implements Games{

    @Override
    public void rules() {
        System.out.println("10 overs");
    }

    @Override
    public void numberOfPlayers() {
        System.out.println("11 Players");
    }

    public static void main(String[] args) {
        Cricket crc = new Cricket();
        crc.numberOfPlayers();
        crc.rules();
        System.out.println(Games.a);
    }
}
