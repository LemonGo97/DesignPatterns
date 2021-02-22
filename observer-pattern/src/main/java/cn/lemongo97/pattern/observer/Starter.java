package cn.lemongo97.pattern.observer;

import java.util.Observer;

public class Starter {

    public static void main(String[] args) {
        Observer observerPerson1 = new ObserverPerson1();
        Observer observerPerson2 = new ObserverPerson2();
        Observer observerPerson3 = new ObserverPerson3();

        BeObserverPerson beObserverPerson = new BeObserverPerson();

        beObserverPerson.addObserver(observerPerson1);
        beObserverPerson.addObserver(observerPerson2);
        beObserverPerson.addObserver(observerPerson3);

        beObserverPerson.action1();
        beObserverPerson.action2();

    }

}
