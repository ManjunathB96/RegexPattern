package com.bridgelabz.passwordUC;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordUC6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password :");
        String password = scanner.nextLine();

        Pattern pattern = Pattern.compile("^(?=.*[A-Z]).{1,}$");
        Matcher matcher = pattern.matcher(password);

        if(matcher.matches() == true) {
            System.out.println(password + "  " + "is valid password :" + matcher.matches());
        }
        else{
            System.out.println(password+"  "+ "is not valid password :"+matcher.matches());
        }
    }
}
