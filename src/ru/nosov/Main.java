package ru.nosov;

public class Main {

    public static void main(String[] args) {
	// write your code here
//

        //String task (Class work)
//        String[] str = {"b", "a", "d", "c"};
//        StringTask.stringBubleSorter(str);
//        System.out.println(Arrays.toString(str));

        //Lesson Tasks:
        System.out.println("String Home Tasks:" + "\n");

        //Task1
        System.out.println("Task1:");
        System.out.println("The longest String is: "
                +  StringTasks.task1("abcsssssss", "abcd", "abcdefg") + "\n");


        //Task2
        System.out.println("Task2:");
        String str = "Deed";
        System.out.println("Palindrome checker status: " + StringTasks.task2(str) + "\n");

        //Task3
        System.out.println("Task3:");
        String textTask3 = "Ну конечно, этот нехороший стульчик," +
                " это он, бяка, сделал Вовочке бо-бо!";
        System.out.println("Original Text: " + textTask3);
        System.out.println("Censured Text: " + StringTasks.task3(textTask3) + "\n");


        //Task4
        System.out.println("Task4:");
        String string1 = "ABAxxABABAyy";
        String string2 = "ABA";
        System.out.println("Quantity of matches: " + StringTasks.task4(string1, string2) + "\n");


        //Task5
        System.out.println("Task5:");
        String textTask4 = "This is a test string";
        System.out.println("Original Text: " + textTask4);
        System.out.println("Inverse text: " + StringTasks.task5("This is a test string"));


    }
}
