package com.company.exam;

public class ThirdQuestion {
    public static void main(String[] args) {

        String result1 = getSignAndParity(-13137868);
        String result2 = getSignAndParity(-2);
        String result3 = getSignAndParity(-1);
        String result4 = getSignAndParity(0);
        String result5 = getSignAndParity(1);
        String result6 = getSignAndParity(378684);
    }

    public static String getSignAndParity(int num) {

        String result;

        if(num >= 0 && num%2 == 0){

            result = "Positive even";

        } else if (num >= 0 && num%2 == 1){

            result = "Positive odd";

        } else if (num < 0 && num%2 == 0){

            result = "Negative even";

        } else {

            result = "Negative odd";
        }

        return result;
    }
}
