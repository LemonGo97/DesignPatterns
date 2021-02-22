package cn.lemongo97.pattern.observer;

import java.util.Observable;

public class BeObserverPerson extends Observable {

    public void action1(){
        System.out.println("正在进行 action1" + " " + this.getClass().getSimpleName());
        super.setChanged();
        super.notifyObservers("正在进行 action1");
    }

    public void action2(){
        System.out.println("正在进行 action2" + " " + this.getClass().getSimpleName());
        super.setChanged();
        super.notifyObservers("正在进行 action2");
    }

}
