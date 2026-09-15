package com.java;

public class MethodsOfString {

    public static void main(String[] args) {
        String str = "Welcome to Java"; //Literal or immutable or Non Editable
        String str1 = "welcome to Java";
        //length()
        int length = str.length();
        System.out.println("length: "+length);

        //toUpperCase
        String upperCase = str.toUpperCase();
        System.out.println("upperCase: "+upperCase);

        //toLowerCase
        String lowerCase = str.toLowerCase();
        System.out.println("lowerCase: "+lowerCase);

        //equal()
        boolean equals = upperCase.equals(lowerCase);
        System.out.println("equals: "+equals);

        //equalIgnoreCase()
        boolean equalsIgnoreCase = upperCase.equalsIgnoreCase(lowerCase);
        System.out.println("equalsIgnoreCase: "+equalsIgnoreCase);

        //find the character at given index
        char c = str.charAt(2);
        System.out.println("charcater at 2: "+c);

        int indexofA = str.indexOf('a');
        System.out.println("indexofA:"+indexofA);

        int a = str.lastIndexOf('a');
        System.out.println("a: "+a);

        String[] words = str.split(" ");
        for(int i = 0;i < words.length;i++){
            System.out.println(words[i]);
        }

        boolean contains = str.contains("XYZ");
        System.out.println("contains:"+contains);

        String java = str.replace("Java", " Selenium");
        System.out.println("java: "+java);

        String ss = " ";
        boolean blank = ss.isBlank();
        System.out.println("blank: "+blank);

        boolean empty = ss.isEmpty();
        System.out.println("empty: "+empty);

        String name = "    Test     ";
        System.out.println("Name: "+name);
        String trim = name.trim();
        System.out.println("trim: "+trim);
    }
}
