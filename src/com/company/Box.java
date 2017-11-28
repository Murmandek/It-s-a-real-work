package com.company;

import java.util.ArrayList;

/**
 * Created by Ilya on 23.11.2017.
 */
public class Box {
    ArrayList<Figure> list = new ArrayList<>(20);

    public void addFigure(Figure a) {
        if (list.size() < 20) {
            this.list.add(a);
        }
        else {
            System.out.println("Array is full");
        }
    }

    public Figure getFigure(int number) {
        if (number <= 20) {
            //System.out.println(this.list.get(number));
            return this.list.get(number);
        }
        else {
            System.out.println("Error");
            return null;
        }
    }

    public Figure extractByNumber(int number) {
        if (number <= 20) {
            Figure a = this.getFigure(number);
            this.list.remove(number);
            return a;
        }
        else {
            System.out.println("Error");
            return null;
        }
    }

    public void replaceByNumber(int number, Figure a) {
        if (number <= 20) {
            this.list.set(number, a);
        }
        else {
            System.out.println("Error");
        }
    }

    public String toString() {
        double totalArea = 0;
        double totalPerimeter = 0;

        for (Figure figure : this.list) {
            totalArea += figure.getArea();
            totalPerimeter += figure.getPerimeter();
        }
        return "Count: " + this.list.size() + "\nSum area: " + totalArea + "\nSum perimeter: " + totalPerimeter;
    }
}
