package cn.lemongo97.pattern.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverPerson1 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        this.doSomething(arg.toString());
    }

    public void doSomething(String msg){
        System.out.println(msg  + " "+ this.getClass().getSimpleName());
    }
}
