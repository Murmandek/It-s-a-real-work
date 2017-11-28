package com.company;

import java.awt.*;

/**
 * Created by Ilya on 20.11.2017.
 */
public class Paper implements Material, Painting{
    private Colors figureColor;

    @Override
    public String getInformationAboutMaterial() {
        return this.getClass().getName();
    }

    @Override
    public void paint(Painting.Colors figureColor) {
        this.figureColor = figureColor;
    }

    public Colors getFigureColor() {
        return this.figureColor;
    }

    Paper(Colors figureColor){ this.figureColor = figureColor; }

    Paper(){
        this.figureColor = null;
    }
}
