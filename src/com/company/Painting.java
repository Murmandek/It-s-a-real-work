package com.company;

import java.awt.*;

/**
 * Created by Ilya on 18.11.2017.
 */
public interface Painting {
    enum Colors {red, green, purple}
    void paint(Painting.Colors color);
    Painting.Colors getFigureColor();
}
