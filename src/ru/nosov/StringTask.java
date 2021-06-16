package ru.nosov;

public class StringTask {

    public static String[] stringBubleSorter (String[] str) {

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length - i - 1; j++) {

                if (str[j].compareTo(str[j+1]) > 0) {
                    String temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }
        }
        return str;
    }
}
