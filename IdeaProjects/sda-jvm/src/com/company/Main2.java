package com.company;

import java.util.List;

/**
 * Created by RENT on 2017-05-25.
 */
public class Main2 {
    public static final String filePath = "C:\\Users\\RENT\\IdeaProjects\\sda-jvm\\src\\com\\company\\plik.txt";

    public static void main(String[] args) {
List<String> lines = FileHelper.readFile(filePath);

        System.out.println(lines.size());
    }
}
