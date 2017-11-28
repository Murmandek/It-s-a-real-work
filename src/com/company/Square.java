package com.company;

/**
 * Created by Ilya on 26.10.2017.
 */
public class Square implements Figure {
    private double length;
    private Material material;

    @Override
    public double getArea() {
        return length*length;
    }

    @Override
    public double getPerimeter() {
        return length*4;
    }

    @Override
    public Material getMaterial() {
        return this.material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Square(double length){
        setLength(length);
        setMaterial(new Paper());
    }

    public Square(double length, Material material){
        setLength(length);
        setMaterial(material);
    }

    public Square(double length, Figure figure){
        if (figure.getTrue(length)){
            setLength(length);
            setMaterial(getMaterial());
        }
        else{
            System.out.println("Oops, some error");
        }
    }

    public String getInfoAboutFigure() {
        try {
            return material.getInformationAboutMaterial() + "\nFigure: " + this.getClass().getName() +  "\nLength: " + this.length;
        } catch (Exception e) {
            return "This figure is empty";
        }
    }

    public  void paint(Painting.Colors colors){
        if (material instanceof Painting){
            ((Painting) material).paint(colors);
        }
    }

    public boolean getTrue(double newLength){
        if (this.length >= newLength)
            return true;
        else
            return false;
    }
}
