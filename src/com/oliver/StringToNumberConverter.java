package com.oliver;

public class StringToNumberConverter {

    public int convert(String input) {

        if (input == null || input.length() == 0) throw new IllegalArgumentException("Input must contain characters.");

        boolean isNegative = (input.charAt(0) == '-');
        int answer = 0;

        for(int i = input.length() - 1, tens = 1; i >= (isNegative ? 1: 0); i--, tens *= 10) {
            switch (input.charAt(i)) {
                case '0':
                    break;
                case '1':
                    answer += tens;
                    break;
                case '2':
                    answer += (tens * 2);
                    break;
                case '3':
                    answer += (tens * 3);
                    break;
                case '4':
                    answer += (tens * 4);
                    break;
                case '5':
                    answer += (tens * 5);
                    break;
                case '6':
                    answer += (tens * 6);
                    break;
                case '7':
                    answer += (tens * 7);
                    break;
                case '8':
                    answer += (tens * 8);
                    break;
                case '9':
                    answer += (tens * 9);
                    break;
                default:
                    throw new IllegalArgumentException("Input must contain - or characters 0 through 9.");
            }
        }

        return answer * (isNegative ? -1: 1);
    }
}
