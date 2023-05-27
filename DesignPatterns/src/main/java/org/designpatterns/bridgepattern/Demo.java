package org.designpatterns.bridgepattern;

public class Demo {

    public static void main(String[] args) {
        Shape shapeOne = new Circle(10, 100, 100, new DrawAPIOne());
        Shape shapeTwo = new Circle(10, 100, 100, new DrawAPITwo());

        shapeOne.draw();
        shapeTwo.draw();
    }
}
