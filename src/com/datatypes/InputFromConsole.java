package com.datatypes;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class InputFromConsole {
    public static void main(String[] args){
        //Literal Form
            String strA= "Welcome To java";
            String strB= "Welcome To java";
        System.out.println("********* Literal form ***************");
        System.out.println("strA: "+System.identityHashCode(strA));
        System.out.println("strB: "+System.identityHashCode(strB));
        System.out.println("StrA: Before "+strA);
        String strC = strA.concat(" Selenium");
        System.out.println("StrA -->StrC: After "+strC);
        System.out.println("strC: "+System.identityHashCode(strC));

        System.out.println("********* Non-Literal form ***************");
        StringBuffer nonStrA =new StringBuffer("Welcome To java");
        StringBuffer nonStrB =new StringBuffer("Welcome To java");
        System.out.println("nonStrA: "+System.identityHashCode(nonStrA));
        System.out.println("nonStrB: "+System.identityHashCode(nonStrB));
        System.out.println("Before append nonStrA: "+nonStrA);
        nonStrA.append(" Selenium");
        System.out.println("Before append nonStrA: "+nonStrA);
        System.out.println("nonStrA after append address: "+System.identityHashCode(nonStrA));
    }
}
