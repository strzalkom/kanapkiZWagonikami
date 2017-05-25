package com.company;

import java.security.InvalidParameterException;

/**
 * Created by RENT on 2017-05-25.
 */
public class Silnia {


    public static int oblicz(int n){


        if(n < 0 ) {
            throw new InvalidParameterException("Argument nie moze byc mniejszy od 0");
        }
          if (n ==1 || n == 0 ){
                return 1;
        }else{
            return oblicz(n-1)* n;
        }
    }


}
