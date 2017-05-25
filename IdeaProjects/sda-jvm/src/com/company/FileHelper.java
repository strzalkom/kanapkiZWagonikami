package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-05-25.
 */
public class FileHelper {
//helpery zazwyczja sa static
    public static List<String> readFile(String path){
      List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(Paths.get(path));
        }catch (IOException ex){
            ex.printStackTrace();
        }
        return lines;
    }
}
