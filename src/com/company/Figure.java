package com.company;

/**
 * Created by Ilya on 26.10.2017.
 */
public interface Figure {
    double getArea();
    double getPerimeter();
    Material getMaterial();
    boolean getTrue(double length);
    String getInfoAboutFigure();
}
