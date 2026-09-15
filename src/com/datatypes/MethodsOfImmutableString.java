package com.datatypes;

public class MethodsOfImmutableString {
public int a = 10;
    public static void main(String[] args) {
        String str = "Welcome to Java";
        String strTwo = "Welcome to Java";
        String strThree = "welcome to java";
        System.out.println("Str: "+str);
        String modified = str.concat(" Selenium");
        System.out.println("modified: "+modified);

        int len = str.length();
        System.out.println("No of characters in a given string : "+len);

        String upperCase = str.toUpperCase();
        System.out.println("upperCase: "+upperCase);

        String lowerCase = str.toLowerCase();
        System.out.println("lowerCase: "+lowerCase);

        //Strict Verification
        boolean equals = str.equals(strThree);
        System.out.println("equals: "+equals);

        //case sensitivity
        boolean equalIgnoreCase = str.equalsIgnoreCase(strThree);
        System.out.println("equalIgnoreCase: "+equalIgnoreCase);

        boolean contains = str.contains("xyz ");
        System.out.println("contains: "+contains);

        int w = str.indexOf('Z');
        System.out.println("index of o: "+w);

        int o = str.lastIndexOf('o');
        System.out.println("index of o: "+o);

        char c = str.charAt(2);
        System.out.println("c: "+c);

        String s1 = "";
        String s2 = "     ";

        System.out.println("s1.isBlank(): "+s1.isBlank());
        System.out.println("s2: "+s2.isBlank());

        System.out.println("s1.isEmpty(): "+s1.isEmpty());
        System.out.println("s2: "+s2.isEmpty());

        String s3 = "           welcome          ";
        String trim = s3.trim();
        System.out.println("s3  :"+s3);
        System.out.println("trim: "+trim);

        String s4 = "!@45Java58(G*$&*";
        String substring = s4.substring(s4.indexOf('J'), s4.lastIndexOf('a')+1);
        System.out.println("substring: "+substring);

        String replace = str.replace('a', 'o');
        System.out.println("replace: "+replace);

        String[] s = str.split(" ");

        for(int i = 0; i<s.length;i++){
            System.out.println(s[i]);
        }

        int a = 10,b = 20;
        System.out.println("a+b: "+(a+b)); //30
        String f = "10",d ="20"; //1020

        //convert any datatype to String
        String s5 = String.valueOf(a);
        String s6 = String.valueOf(b);
        System.out.println("s5+s6: "+(s5+s6)); //1020

    }
}
