package org.designpatterns.singletonpattern;

public class SingletonClass {

    public static SingletonClass instance = new SingletonClass();

    private SingletonClass(){

    }

    public static SingletonClass getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello, World!");
    }
}
