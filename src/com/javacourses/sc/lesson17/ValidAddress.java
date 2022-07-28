package com.javacourses.sc.lesson17;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidAddress {

    public static final String IP_ADDRESS_PATTERN
            = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
    private final Pattern pattern;

    public ValidAddress() {
        pattern = Pattern.compile(IP_ADDRESS_PATTERN);

    }

    public boolean validate(String ipAddress) {
        return pattern.matcher(ipAddress).matches();
    }
}

