package org.designpatterns.builderpattern;

public class Demo {

    public static void main(String[] args) {
        HouseBuilder builder = new HouseBuilder();
        builder
                .setFoundation("Concrete")
                .setInterior("Modern")
                .setRoof("Tiles")
                .setStructure("Brick")
                .build();

        House house = new House(builder);
        System.out.println(house.toString());
    }
}
