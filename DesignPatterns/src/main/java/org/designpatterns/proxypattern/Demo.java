package org.designpatterns.proxypattern;

public class Demo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");
        image.display();
        image.display();
    }
}
