package com.javacourses.sc.lesson8;

public class Main {
    public static void main(String[] args) {
        Phone object = new Phone("+375295641235", "SamsungS10+", 168.6);
        Phone object1 = new Phone("+375336542485", "Iphone12", 172.8);
        Phone object2 = new Phone("+375442685412", "Xiaomi X11", 201.4);

        System.out.println(object);
        System.out.println(object1);
        System.out.println(object2);
        System.out.println();

        object.receiveCall("Mother");
        object1.receiveCall("Father", "+375293116541");
        object2.receiveCall("Sister", "+375294562178");
        System.out.println();

        String[] phoneNumber = {
                "+375293920512",
                "+375293920524",
                "+375293920654",
                "+375293923245",
                "+375292346532",
                "+375293435622",
                "+375295216548",
                "+375295216242"
        };
        object.sendMessage(phoneNumber[2],phoneNumber[3],phoneNumber[4]);
        object.sendMessage("Hello!!!");
        System.out.println();


        object1.sendMessage("Father", "Hello, where are you bro?");
        object2.sendMessage("Sister", "Hi, brother. How are you?");
    }
}
