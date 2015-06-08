package com.oliver;

public class Main {

    public static void main(String[] args) {

        StringToNumberConverter strToNumConverter = new StringToNumberConverter();

        System.out.println("Input = 123 and output = " + strToNumConverter.convert("123"));
        System.out.println("Input = -123 and output = " + strToNumConverter.convert("-123"));
        System.out.println("Input = -103 and output = " + strToNumConverter.convert("-103"));

        //System.out.println("Input = -103 and output = " + strToNumConverter.convert("-1 3"));

        NumberToStringConverter numToStrConverter = new NumberToStringConverter();

        System.out.println("Input = 123 and output = " + numToStrConverter.convert(123));
        System.out.println("Input = -123 and output = " + numToStrConverter.convert(-123));
        System.out.println("Input = -103 and output = " + numToStrConverter.convert(-103));
    }
}
