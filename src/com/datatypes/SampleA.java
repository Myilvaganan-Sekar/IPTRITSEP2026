package com.datatypes;

public class SampleA {

    public void addOfTwo(int num1,int num2){
        int sum = num1+num2; //code
        System.out.println("sum of "+num1+" + "+num2+" = "+sum);
    }


    public static void main(String[] args) {
        SampleA sa = new SampleA();
        sa.addOfTwo(10,20);
        sa.addOfTwo(20,30);
        sa.addOfTwo(30,40);
    }
}