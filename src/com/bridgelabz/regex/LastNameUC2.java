package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastNameUC2 {
    public static void main(String[] args) {
        Scanner  scanner= new Scanner(System.in);
        System.out.println("Enter your first name and give space and  last name :");
        String firstLastName = scanner.nextLine();

        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}(\\s)[A-Z][a-z]{3,}");
        Matcher matcher = pattern.matcher(firstLastName);


        if(matcher.matches() == true) {
            System.out.println(firstLastName + "  " + "is valid name :" + matcher.matches());
        }
        else{
            System.out.println(firstLastName+"  "+ "is not valid name :"+matcher.matches());
        }
    }
}
