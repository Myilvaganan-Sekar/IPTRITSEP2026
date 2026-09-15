package com.datatypes;

public class FlowControlStatement {

    public static void main(String[] args) {
        int i = 1;
        while(i <= 5){	//1

            if((i == 2) ||(i==4)){
                i++;
                continue;
            }
            System.out.println("Numbers: "+i);
            i++;
        }
    }
}
