package org.designpatterns.flyweightpattern;

public class Demo {

    private static final String[] colors = {"Blue", "Green", "Red", "Yellow", "Black"};

    public static void main(String[] args) {

        for(int i = 0; i < 15; i++){
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setRadius(100);
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.draw();
        }
    }

    private static String getRandomColor(){
        return colors[(int)(Math.random()*colors.length)];
    }

    private static int getRandomX(){
        return (int) (Math.random()*100);
    }

    private static int getRandomY(){
        return (int) (Math.random()*100);
    }
}
