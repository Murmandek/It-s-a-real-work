package com.company;

/**
 * Created by Ilya on 27.10.2017.
 */
public class Rectangle implements Figure {
    private double length;
    private double height;
    private Material material;

    @Override
    public double getArea() {
        return length*height;
    }

    @Override
    public double getPerimeter() {
        return (length+height)*2;
    }

    @Override
    public Material getMaterial() {
        return this.material;
    }

    public void setHeight(double h) {
        this.height = h;
    }

    public void setLength(double a) {
        this.length = a;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Rectangle(double length, double height){
        setLength(length);
        setHeight(height);
        setMaterial(new Paper());
    }

    public Rectangle(double length, double height, Material material){
        setLength(length);
        setHeight(height);
        setMaterial(material);
    }

    public Rectangle(double length, double height, Figure figure){
        if (figure.getTrue(length)){
            setLength(length);
            setHeight(height);
            setMaterial(getMaterial());
        }
        else{
            System.out.println("Oops, some error");
        }
    }

    public  void paint(Painting.Colors colors){
        if (material instanceof Painting){
            ((Painting) material).paint(colors);
        }
    }

    public String getInfoAboutFigure() {
        try {
            return material.getInformationAboutMaterial() + "\nFigure: " + this.getClass().getName() +  "\nLength: " + this.length;
        } catch (Exception e) {
            return "This figure is empty";
        }
    }

    public boolean getTrue(double newLength){
        if (this.length >= newLength)
            return true;
        else
            return false;
    }
}
