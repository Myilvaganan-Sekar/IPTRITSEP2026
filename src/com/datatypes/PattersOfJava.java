package com.datatypes;

public class PattersOfJava {
    public static void main(String[] args){
        PattersOfJava pOJ= new PattersOfJava();
       // pOJ.assignmentOperator();
      //  pOJ.relationalOperator();
        pOJ.logicalOperator();
    }

    //non abstarct method- method with implementation or logics
    public void addOfTwoNumber(){
        int num1 = 10, num2 = 20,sum = num1+num2;
        System.out.println("Sum of two numbers num1 "+num1+" + num2 "+num2+" = "+sum);
        System.out.println("pre increment num1++: "+(num1++));
        System.out.println("num1 after pre inc: "+num1);
        System.out.println("post inc of ++num2: "+(++num2));
    }

    public void assignmentOperator(){
        int a = 10;
        a += 5;
        System.out.println("a= a+ 5 optimize as a += 5  "+a);
        a -= 5;
        System.out.println("a -= 5: "+a);

        a *= 2;
        System.out.println("a *= 2: "+a);

        a /= 2;
        System.out.println("a/= 2: "+a);

        a %= 3;
        System.out.println("a%=3 "+a);
    }

    public void relationalOperator(){
     int a = 10,b = 20;
        a = b;
        System.out.println("a == b: "+(a==b));
        System.out.println("a != b: "+(a!=b));
        System.out.println("a < b: "+(a<b));
        System.out.println("a>b: "+(a>b));
        System.out.println("a<= b: "+(a<=b));
        System.out.println("a>= b: "+(a>=b));
    }

    public void logicalOperator(){
        boolean a = true,b = false;
        System.out.println("a&&b: "+(a&&b));
        System.out.println("a|| b: "+(a||b));
        System.out.println("!b"+(!b));

    }
}
