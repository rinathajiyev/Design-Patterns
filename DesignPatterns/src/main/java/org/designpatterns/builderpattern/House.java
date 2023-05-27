package org.designpatterns.builderpattern;

public class House {
    private String foundation;
    private String structure;
    private String interior;
    private String roof;

    public House(HouseBuilder builder){
        this.foundation = builder.getFoundation();
        this.structure = builder.getStructure();
        this.interior = builder.getInterior();
        this.roof = builder.getRoof();
    }

    public String getFoundation() {
        return foundation;
    }

    public String getStructure() {
        return structure;
    }

    public String getInterior() {
        return interior;
    }

    public String getRoof() {
        return roof;
    }

    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", structure='" + structure + '\'' +
                ", interior='" + interior + '\'' +
                ", roof='" + roof + '\'' +
                '}';
    }
}
