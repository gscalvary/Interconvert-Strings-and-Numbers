package com.oliver;

// O(1) space complexity and O(n) time complexity where n is the length of the number being converted.
public class NumberToStringConverter {

    public String convert(long input) {

        if(input == 0) return "0";

        StringBuilder builder = new StringBuilder();
        if(input < 0){
            builder.append("-");
            input *= -1;
        }

        // Find the base 10 amplitude of the number.
        int baseTenAmplitude = 1;
        while(baseTenAmplitude <= input) {
            baseTenAmplitude *= 10;
        }
        baseTenAmplitude /= 10;

        // Use the amplitude to break the number down, from left to right, into its digits.
        while(baseTenAmplitude >= 1) {
            int digit = (int)input/baseTenAmplitude;
            switch(digit) {
                case 0:
                    builder.append("0");
                    break;
                case 1:
                    builder.append("1");
                    break;
                case 2:
                    builder.append("2");
                    break;
                case 3:
                    builder.append("3");
                    break;
                case 4:
                    builder.append("4");
                    break;
                case 5:
                    builder.append("5");
                    break;
                case 6:
                    builder.append("6");
                    break;
                case 7:
                    builder.append("7");
                    break;
                case 8:
                    builder.append("8");
                    break;
                case 9:
                    builder.append("9");
                    break;
            }
            input %= baseTenAmplitude;
            baseTenAmplitude /= 10;
        }

        return builder.toString();
    }
}
