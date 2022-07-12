package com.day3.test1;

public class Car {

    static String format = "SS-SS-NNNN";

    @Override
    public String toString() {
        return "Car{" +
                "number='" + number + '\'' +
                '}';
    }

    String number = null;
}
