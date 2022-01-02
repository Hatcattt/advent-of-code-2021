package com.hatcattt.aoc2021.utils;

/**
 * Convert binary format.
 */
public class Binary {

    /**
     * Get the decimal representation of a binary string format.
     * @param binaryFormat binary string format to convert.
     * @return int : binary decimal format
     */
    public static int getDecimal(String binaryFormat) {
        return Integer.parseInt(binaryFormat, 2);
    }

    /**
     * Get the binary string format representation of a decimal number (int).
     * @param decimalNumber the number to convert in binary string format
     * @return String : binary string format
     */
    public static String getBinary(int decimalNumber) {
        return Integer.toBinaryString(decimalNumber);
    }
}
