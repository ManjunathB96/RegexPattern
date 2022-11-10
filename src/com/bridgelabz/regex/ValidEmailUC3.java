package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmailUC3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Email Id :");
        String email = scanner.nextLine();

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+[@][a-z]+[\\.][a-z]{2,3}");
        Matcher matcher = pattern.matcher(email);

        if(matcher.matches() == true) {
            System.out.println(email + "  " + "is valid email :" + matcher.matches());
        }
        else{
            System.out.println(email+"  "+ "is not valid email :"+matcher.matches());
        }
    }
}
