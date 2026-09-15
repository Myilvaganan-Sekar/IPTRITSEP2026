package com.basics;

public class Keywords {
    static int a = 10;

    public static void main(String[] args) {
        System.out.println(a);
        apple();
    }

    public static void apple(){
        System.out.println("Apple method logic");
       // orange(); //calling the non static inside the static stuff
    }

    //1.We can call it without creating object inside the static method

    public void orange(){
        System.out.println("orange logic");
        apple();  //inside a non static stuff it allows to call both the static and non static stuff
    }

    //2.Non static method allows to access both the static and non static stuff
    //3.Static method allows to access only the static stuff
}
