package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileFormatUC4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the country code and then enter 10 digit mobile number :");
        String mobileNum = scanner.next();

        Pattern pattern = Pattern.compile("[1-9]{2}[\\s]^[89][0-9]{9}$");
        Matcher matcher = pattern.matcher(mobileNum);

        if(matcher.matches() == true) {
            System.out.println(mobileNum + "  " + "is valid Mobile Number :" + matcher.matches());
        }
        else{
            System.out.println(mobileNum+"  "+ "is not valid mobile Number :"+matcher.matches());
        }
    }
}
