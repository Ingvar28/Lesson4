package ru.nosov;

public class StringLesson {

    String str = "Hello, Java";
//        int len = str.length();
//        System.out.println(str.length());
//        System.out.println(len);
//        char symbol = str.charAt(4);
//        System.out.println(symbol);
//
//        //isEmpty
//        boolean empty = str.isEmpty();
//        System.out.println(empty);

    //toUpperCase();
//        String str1 = "Hello, Java lang top hop";
//        String strUP = str.toUpperCase(str1);




//        str.isEmpty();
//        str.toUpperCase();
//        str.toLowerCase();
//        str.startsWith(prefix);
//        str.endsWith(prefix);

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
