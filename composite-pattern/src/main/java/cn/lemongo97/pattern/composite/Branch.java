package cn.lemongo97.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Branch extends Corp {

    private ArrayList<Corp> subordinateList = new ArrayList<>();

    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    public void addSubordinate(Corp corp){
        corp.setParent(this);
        this.subordinateList.add(corp);
    }

    public List<Corp> getSubordinateInfo() {
        return this.subordinateList;
    }
}
