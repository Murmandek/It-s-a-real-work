package com.company;

/**
 * Created by Ilya on 27.10.2017.
 */
public class Circle implements  Figure {
    private double radius;
    private Material material;

    @Override
    public double getArea() {
        return Math.PI* radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI* radius;
    }

    @Override
    public Material getMaterial() {
        return this.material;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Circle(double radius){
        setRadius(radius);
        setMaterial(new Paper());
    }

    public Circle(double radius, Material material){
        setRadius(radius);
        setMaterial(material);
    }

    public Circle(double radius, Figure figure){
        if (figure.getTrue(radius)){
            setRadius(radius);
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
            return material.getInformationAboutMaterial() + "\nFigure: " + this.getClass().getName() +  "\nRadius: " + this.radius;
        } catch (Exception e) {
            return "This figure is empty";
        }
    }

    public boolean getTrue(double newRadius){
        if (this.radius >= newRadius)
            return true;
        else
            return false;
    }
}
