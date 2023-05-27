package org.designpatterns.singletonpattern;

public class Demo {

    public static void main(String[] args) {
        SingletonClass singleton = SingletonClass.getInstance();
        singleton.showMessage();
    }
}
