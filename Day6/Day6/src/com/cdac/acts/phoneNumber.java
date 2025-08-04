package com.cdac.acts; // Assuming you want to keep the same package

public class phoneNumber {

    public static String formatMobileNumber(String mobileNumber) {
        if (mobileNumber == null || mobileNumber.isEmpty()) {
            return "Invalid Input: Empty number";
        }

        // Remove any non-digit characters
        String digitsOnly = mobileNumber.replaceAll("[^0-9]", "");

        int length = digitsOnly.length();

        if (length < 10) {
            return "Error for less than 10 char";
        }

        StringBuilder formattedNumber = new StringBuilder();

        if (length >= 12 && digitsOnly.startsWith("91")) {
            formattedNumber.append("+91-");
            formattedNumber.append(digitsOnly.substring(2, 5));
            formattedNumber.append("-");
            formattedNumber.append(digitsOnly.substring(5, 8));
            formattedNumber.append("-");
            formattedNumber.append(digitsOnly.substring(8));
        } else if (length == 10) {
            formattedNumber.append("+91-");
            formattedNumber.append(digitsOnly.substring(0, 3));
            formattedNumber.append("-");
            formattedNumber.append(digitsOnly.substring(3, 6));
            formattedNumber.append("-");
            formattedNumber.append(digitsOnly.substring(6));
        } else if (length == 11 && digitsOnly.startsWith("0")) {
            formattedNumber.append("+91-");
            formattedNumber.append(digitsOnly.substring(1, 4));
            formattedNumber.append("-");
            formattedNumber.append(digitsOnly.substring(4, 7));
            formattedNumber.append("-");
            formattedNumber.append(digitsOnly.substring(7));
        } else {
            return "Invalid Input: Cannot format";
        }

        return formattedNumber.toString();
    }

    public static void main(String[] args) {
        String num1 = "+91-988-162-8598";
        String num2 = "+919881628598";
        String num3 = "9881628598";
        String num4 = "988162859";
        String num5 = "09881628598"; // Starting with 0

        System.out.println("Input: " + num1 + ", Output: " + formatMobileNumber(num1));
        System.out.println("Input: " + num2 + ", Output: " + formatMobileNumber(num2));
        System.out.println("Input: " + num3 + ", Output: " + formatMobileNumber(num3));
        System.out.println("Input: " + num4 + ", Output: " + formatMobileNumber(num4));
        System.out.println("Input: " + num5 + ", Output: " + formatMobileNumber(num5));
    }
}