package com.basics;

public class OOPSExample {

    public void calculator(){
        System.out.println("Calculator method");
    }

    public void calculator(int num1){
        System.out.println("get the num1"+num1);
    }

    public void calculator(float num2){
        System.out.println("Get float num2: "+num2);
    }

    public void calculator(String name,int age){
        System.out.println("Get name : "+name);
        System.out.println("Get age : "+age);
    }

    public void calculator(int age,String name){
        System.out.println("Get age : "+age);
        System.out.println("Get name : "+name);
    }

    public static void main(String[] args) {
        OOPSExample oops= new OOPSExample();
        oops.calculator();
    }
}
