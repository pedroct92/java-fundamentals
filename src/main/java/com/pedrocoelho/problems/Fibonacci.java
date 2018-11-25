package com.pedrocoelho.problems;

public class Fibonacci {

    public static Integer getNumber(Integer value) {

        if (value == 0){
            return 0;
        }else if(value == 1 || value == 2) {
            return 1;
        } else {
            return getNumber(value - 1) + getNumber(value - 2);
        }

    }
}
