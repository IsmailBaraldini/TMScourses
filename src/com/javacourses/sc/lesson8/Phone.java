package com.javacourses.sc.lesson8;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Calling you : " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Calling you : " + "  " + name + "  " + number);
    }
    public void sendMessage(String message){
        System.out.println("Message sent to:" + message);
    }
    public void sendMessage(String number,String number1,String number2)
    {
        System.out.println("These phone numbers : " + number + " " + number1 + " " + number2);
    }
    public void sendMessage(String name,String message){
        System.out.println("Message sent to:"  + name +"  " + "Message text :  " + message);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
