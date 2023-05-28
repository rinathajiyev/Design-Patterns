package org.designpatterns.proxypattern;

public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    public void loadFromDisk(String fileName){
        System.out.println("Image loaded from disk: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying: " + fileName);
    }
}
