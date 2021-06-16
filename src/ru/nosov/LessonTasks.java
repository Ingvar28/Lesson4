package ru.nosov;

import java.util.Arrays;

public class LessonTasks {

    public static String task1(String str1, String str2, String str3) {
        String[] lines = {str1, str2, str3};
        int maxindex = 0;
        for (int i = 0; i < lines.length; i++) {
            int index = i;

            for (int j = i + 1; j < lines.length; j++) {
                if (lines[index].length() > lines[j].length()) {
                    index = j;
                }
            }
            maxindex = index;
        }
        return lines[maxindex];
    }

    public static boolean task2(String str) {

        StringBuilder original = new StringBuilder(str);

        String revers = new String(original.reverse());

        return str.equals(revers);

    }



    public static String task3(String str) {
        String[] text = str.split(" ");
        System.out.println(Arrays.toString(text));

        for (int i = 0; i < text.length; i++) {
            int index;
            if (text[i].equals("бяка")) {
                index = i;
                text[i] = "[вырезано цензурой]";
                System.out.println(text[i]);
            }

        }

        System.out.println(Arrays.toString(text));
        return text.toString();

    }
    public static void task4() {



    }
    public static void task5() {


    }


}
