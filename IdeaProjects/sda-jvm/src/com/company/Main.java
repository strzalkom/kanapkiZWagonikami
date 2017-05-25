package com.company;

import java.security.InvalidParameterException;

/**
 * Created by RENT on 2017-05-25.
 */
public class Main {
    public static void main(String[] args) {
        int result = 0;
        try {
         result = Silnia.oblicz(-5);

        }catch (InvalidParameterException ex){
            ex.printStackTrace();
        }

        System.out.println(result);
    }
}
