package com.javacourses.sc.lesson12;

import java.io.*;
import javax.management.MBeanConstructorInfo;

public class Main {
    public static void main(String[] args) {
        File file = new File("/C:/", "DocNumber.txt");
        File file2 = new File("/C:/", "ValidDocument.txt");
        File file3 = new File("/C:/", "NotValidDocument.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String[] str = new String[10];
            for (int i = 0; i < str.length; i++) {
                str[i] = reader.readLine();
                System.out.println(str[i]);
            }
            File writeInFile = new File("/C:/", "AnotherText.txt");
            FileWriter fileWriter = new FileWriter(writeInFile);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            for (int i = 0; i < str.length; i++) {
                writer.write(str[i]);
                writer.newLine();
            }
            writer.close();
            FileWriter fileWriter1 = new FileWriter(file2);
            BufferedWriter writer1 = new BufferedWriter(fileWriter1);
            FileWriter fileWriter2 = new FileWriter(file3);
            BufferedWriter writer2 = new BufferedWriter(fileWriter2);
            for (int i = 0; i < str.length; i++) {
                if (str[i].length() == 15) {
                    writer1.write(str[i]);
                    writer1.newLine();
                } else {
                    writer2.write(str[i]);
                    writer2.newLine();
                }

            }
            writer1.close();
            writer2.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

}
