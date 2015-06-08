package com.oliver;

public class Main {

    public static void main(String[] args) {

        StringToNumberConverter sToNumConverter = new StringToNumberConverter();

        System.out.println("Input = 123 and output = " + sToNumConverter.convert("123"));
        System.out.println("Input = -123 and output = " + sToNumConverter.convert("-123"));
        System.out.println("Input = -103 and output = " + sToNumConverter.convert("-103"));

        //System.out.println("Input = -103 and output = " + sToNumConverter.convert("-1 3"));
    }
}
