package com.javacourses.sc.lesson17;


import java.util.Scanner;
import java.util.regex.Matcher;

public class Main
{
    public static void main(String[] args) {
        System.out.println(" Input your ip address : ");
        Scanner ip = new Scanner(System.in);
        String ipaddress = ip.next();
        ValidAddress valid = new ValidAddress();
        valid.validate(ipaddress);

        if (ipaddress.matches(ipaddress)) {
            System.out.println(" IP address correct");
        }
        else {
            System.out.println(" IP address not correct");
        }
    }
}
