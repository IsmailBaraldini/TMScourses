package com.javacourses.sc.lesson13;


import java.util.*;

public class Example
    {
        private static final Map<Integer, String> MONTH;
            static {
                MONTH = new HashMap<>();
                MONTH.put(1,"January");
                MONTH.put(2,"February");
                MONTH.put(3,"Mart");
                MONTH.put(4,"April");
                MONTH.put(5,"May");
                MONTH.put(6,"June");
                MONTH.put(7,"July");
                MONTH.put(8,"August");
                MONTH.put(9,"September");
                MONTH.put(10,"October");
                MONTH.put(11,"November");
                MONTH.put(12,"December");
    }

    public static void main(String[] args)
    {
    Integer[] array = new Integer[10];
        Arrays.asList(1,2,3,4,5,8,6,8,4,2,12);
        List<Integer> list = Arrays.asList(array);
        Set<Integer> set = convertListToInteger(list);
        System.out.println(set);
        System.out.println(getMonth(1));
        System.out.println(getMonth(4));
        System.out.println(getMonth(5));
        System.out.println(getMonth(2));
        System.out.println(getMonth(7));
        System.out.println(getMonth(15));
        System.out.println(getMonth(10));
        System.out.println(getMonth(56));
    }

    public static Set<Integer> convertListToInteger(List<Integer> list) {
        Set<Integer> result = new HashSet<>();

        for (int i = 0; i < list.size(); i++) {
            Integer currentElement = list.get(i);

            if (!result.contains(currentElement))
            {
                result.add(currentElement);
            }
        }

        return result;
    }
    public static  String getMonth(Integer monthNumber)
    {
        if (MONTH.containsKey(monthNumber)) {
            return MONTH.get(monthNumber);
        }
        return "Incorrect month number";
    }
}
