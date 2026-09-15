package com;

public class Evening5pm {

    int a;//global Variable or class or instance variable
    long b;
    float c = 123.134564f;
    char d = '@';
    boolean f = true;

    public static void main(String[] args){
        //className objRefName = new ClassName();
        Evening5pm batch = new Evening5pm();
        int a = 20;//local variable
        a = 250; //re-assigning
        System.out.println("value of a is: "+a);
        batch.a = 124;
        System.out.println("int a: "+batch.a);
    }

}
