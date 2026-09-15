package com.basics;

public class Brands {
    int a;
/* Constructor:
1.It is A Special methods
2.It don't have the return type
3.Class Name and Constructor name should be same
4.Constructor will be automatically invoked when we create an instance or object for the class
5.Purpose of Constructor: It is used to initialize the class members
syntax of non abstract method:
public void methodName(){
//body;
}
Syntax of Constructor:
public className(){
//body;
}
Types of Constructor:
1.Non Parameterized or Default Constructor
2.Parameterized Constructor
 */
public Brands(){
    this("java");
    System.out.println("3.Default Constructor or Non Parameterized constructor");
}

public Brands(String Name){
    this(2026);
    System.out.println("2.Parameteized constructor with name"+Name);
}

public Brands(int year){
        System.out.println("1.Parameteized constructor with year "+year);
    }

public void demoMethod(){
    System.out.println("Non abstarct method");
}

    public static void main(String[] args) {
        Brands brdTwo =new Brands();
    }

}
