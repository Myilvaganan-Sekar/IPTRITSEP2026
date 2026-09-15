package com.basics;

import com.datatypes.SampleA;

public class SampleB extends SampleA{

    public int b = 20;
    public void bank(){
        System.out.println("Bank B");
    }


    public static void main(String[] args) {

        SampleB sb= new SampleB();
        sb.bank();
        System.out.println("b: "+sb.b);
        System.out.println("Welcome to Git");

    }
}
