package org.designpatterns.builderpattern;

public class HouseBuilder {
    private String foundation;
    private String structure;
    private String interior;
    private String roof;

    public HouseBuilder(){

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

    public HouseBuilder setFoundation(String foundation) {
        this.foundation = foundation;
        return this;
    }

    public HouseBuilder setStructure(String structure) {
        this.structure = structure;
        return this;
    }

    public HouseBuilder setInterior(String interior) {
        this.interior = interior;
        return this;
    }

    public HouseBuilder setRoof(String roof) {
        this.roof = roof;
        return this;
    }

    public House build(){
        return new House(this);
    }
}
