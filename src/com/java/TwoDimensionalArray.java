package com.java;

public class TwoDimensionalArray {

    public void twoDimensionalArray(){
        //Non literal
        /*
        datatype[][] refName= new datatype[size]; //declaration
        refName[row][col] = value;
        accessing: refname[row][col]
                    1       2       3
                1   10[0,0]      20[0,1]      30
                2   40      50      60
                3   70      80      90[3,3]
         */
        int[][] squareMatrix = {{10},{40,50},{70,80,90}};

        System.out.println(squareMatrix[1][1]);
        System.out.println("To find the row: "+squareMatrix.length);
        System.out.println("To find the col: "+squareMatrix[1].length);

        for(int r= 0;r < squareMatrix.length; r++){//r = 0,1,2,3
            for(int c= 0;c < squareMatrix[r].length;c++){//c = 0,1,2
                System.out.print(squareMatrix[r][c]+"  "); //r = 2, c = 2
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        TwoDimensionalArray twoDim = new TwoDimensionalArray();
        twoDim.twoDimensionalArray();

    }
}
