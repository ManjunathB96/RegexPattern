package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstNameUC1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name :");
        String firstName =scanner.nextLine();

        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}");
        Matcher matcher = pattern.matcher(firstName);

        if(matcher.matches() == true) {
            System.out.println(firstName + "  " + "is valid name :" + matcher.matches());
        }
        else{
            System.out.println(firstName+"  "+ "is not valid name :"+matcher.matches());
        }

    }
}
