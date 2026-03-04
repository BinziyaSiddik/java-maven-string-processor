package com.smu.mscda;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.codec.digest.DigestUtils;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program will capitalize the input string and generate MD5 hex!");
        System.out.print("Enter a string: ");

        String input = scanner.nextLine(); // This is the original input (e.g., "smu")

        // Generate MD5 on the CAPITALIZED string (matches assignment expected output)
        String capitalized = capitalizeString(input);
        String md5Hex = generateMD5(capitalized);

        System.out.println("\nCapitalized string is: " + capitalized);
        System.out.println("MD5 Hex is: " + md5Hex);

        scanner.close();
    }

    public static String capitalizeString(String str) {
        return StringUtils.capitalize(str);
    }

    public static String generateMD5(String str) {
        return DigestUtils.md5Hex(str);
    }
}
