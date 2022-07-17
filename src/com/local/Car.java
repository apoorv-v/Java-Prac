package com.local;

import java.util.Objects;

public class Car implements Cloneable {

    static String format = "SS-SS-NNNN";

    public Car(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "number='" + number + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(number, car.number);
    }

    public Car clone (){
        return new Car(this.number);
    }
    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    public String number = null;
}
