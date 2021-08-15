package ru.nosov;


public class StringTasks {

    /*
    *1.	Написать метод для поиска самой длинной строки.
    *   Добавить несколько строк и вывести самую длинную
     */

    public static String task1(String str1, String str2, String str3) {
        String[] lines = {str1, str2, str3};
        int maxLength = lines[0].length();
        int maxindex = 0;

        for (int i = 1; i < lines.length; i++) {
            if (lines[i].length() > maxLength) {
                maxindex = i;
            }
        }

        return lines[maxindex];
    }


    /*
    2.	Написать метод, который проверяет является ли слово палиндромом.
      Возврат false/true.
    */
    public static boolean task2(String str) {

        return  new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);
    }


    /*
    3.	Напишите метод, заменяющий в тексте все вхождения слова «бяка»
      на «[вырезано цензурой]».
     */
    public static String task3(String str) {

        return str.replace("бяка", "[вырезано цензурой]");
    }


    /*
    4.	Имеются две строки.
     Найти количество вхождений одной (являющейся подстрокой) в другую
     */
    public static int task4(String string1, String string2) {


        return (string1.length() - string1.replace(string2, "").length())
                /string2.length();
    }

    /*
    *5.	Напишите метод, который инвертирует слова в строке.
    *  Предполагается, что в строке нет знаков препинания, и слова разделены пробелами.
        Sample Output:
            The given string is: This is a test string
            The string reversed word by word is:
            sihT si a tset gnirts
    **/
    public static String task5(String str) {

       return new StringBuilder(str).reverse().toString();
    }




}
