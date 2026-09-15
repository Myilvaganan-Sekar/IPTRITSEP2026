package com.java;

public class LiteralForm {
    /* Array - It is used to store more than one value in a single variable
     It is index based
     It is fixed in size
     It supports homogenous datatype
     Types of Array: one Dimensional array [Literal form and Non literal Form]  and Two Dimensional Array
     [Literal form and Non literal Form]
    * * * * *
    1 2 3 4 5 [Length or size]
    0 1 2 3 4 [index = size or length -1]


     */
    public void nonLiteralFormOfArray(){
        /*one Dimensional array:
        datatype[] refName = new datatype[size]; //declaration
        or
        datatype refName[] = new datatype[size];
        assigning:
        refName[index] = value;

        accessing
        call the refName[index]
         */
        int[] arr = new int[5]; //declaration
        arr[0]=10; //assigning
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        System.out.println("index 2: "+arr[2]); //30
        //To find the size or length of array - predefined variable called as length
        System.out.println("Lenght of array: "+arr.length);
        for(int a =0;a < arr.length;a++){
            System.out.println(arr[a]);//accessing
        }

    }

    public void literalForm(){
        /* Literal form
        datatype[] refName = {10,20,30,40,50}; //declaration
        or
        datatype refName[] = {10,20,30,40,50};
         */

        int  arr[] = {10,20,30,40,50};
        System.out.println("Lenght: "+arr.length);
        System.out.println("arr in index 3: "+arr[3]);
//        for(int a = 0;a < arr.length;a++){
//            System.out.println(arr[a]);
//        }
        // for each loop
        for(int b:arr){
            System.out.println(b);
        }

    }


    public static void main(String[] args) {
        LiteralForm lform = new LiteralForm();
        //lform.nonLiteralFormOfArray();
        lform.literalForm();
    }

}
