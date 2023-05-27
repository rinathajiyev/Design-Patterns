package org.designpatterns.bridgepattern;

public class DrawAPITwo implements DrawAPI{

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle [color: red, radius: " + radius + ", x: " + x + ", y: " + y);
    }
}
