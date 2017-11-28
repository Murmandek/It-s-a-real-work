package com.company;

public class Main {

    public static void main(String[] args) {
        Paper paper = new Paper();


        Square square = new Square(7,paper);
        square.paint(Painting.Colors.purple);

        Circle circle = new Circle(5,paper);
        circle.paint(Painting.Colors.green);
        System.out.println(circle.getInfoAboutFigure());


       // System.out.println(square.getInfoAboutFigure());

        Box box = new Box();
        box.addFigure(circle);
        for (int i = 0; i < 19; i++){
            box.addFigure(square);
        }

        box.extractByNumber(15);
        box.replaceByNumber(2, square);
        System.out.println(box.getFigure(10));

       // System.out.println(box.toString());
      /*  Square a = new Square(5);
        Square b = new Square(4);*/
        /*System.out.println("Площадь квадрата равна " + a.getArea());
        System.out.println("Периметр квадрата равен " + a.getPerimeter());
        System.out.println(a.getTrue(a.getA(),b.getA()));*/
/*
        Rectangle re = new Rectangle(2,3);
        System.out.println("Площадь прямоугольника равна " + re.getArea());
        System.out.println("Периметр прямоугольника равен " + re.getPerimeter());

        Circle ci = new Circle(3);
        System.out.println("Площадь круга равна " + ci.getArea());
        System.out.println("Периметр круга равен " + ci.getPerimeter());*/
    }
}
