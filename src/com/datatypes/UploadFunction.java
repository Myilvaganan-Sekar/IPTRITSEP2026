package com.datatypes;

import javax.imageio.stream.FileImageInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class UploadFunction {


    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("First Line");
        FileInputStream file = new FileInputStream("./GIT Notes.docx");
        int[] arr = {1,2,3};
        try {
            System.out.println(arr[4]);
        }catch(ArithmeticException e){// ArithmeticExcpetion e = new ArrayIndexOutOfBoundsException();
            System.err.println(e.getMessage());
            System.out.println("catch block");
        }catch (Exception e) {
            System.out.println("ParentException ");
        }finally {
            System.out.println("Clean up");
        }
        System.out.println("Test line");
        System.out.println("Last Line");
    }
}

//Object ---> Throwable -->Exception --> All the Exception


