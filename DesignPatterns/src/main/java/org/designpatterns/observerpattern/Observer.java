package org.designpatterns.observerpattern;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
