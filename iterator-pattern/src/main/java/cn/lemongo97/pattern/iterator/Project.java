package cn.lemongo97.pattern.iterator;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Project implements IProject{

    private List<IProject> projectList = new ArrayList<>();

    private String name = "";
    private int num = 0;
    private int cost = 0;

    public Project() {
    }

    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public void add(String name, int num, int cost) {
        this.projectList.add(new Project(name,num,cost));
    }

    @Override
    public String getProjectInfo() {
        StringBuilder builder = new StringBuilder("项目名称是：");
        builder.append(this.name).append('\t');
        builder.append("项目人数");
        builder.append(this.num).append('\t');
        builder.append("项目费用");
        builder.append(this.cost);
        return builder.toString();
    }

    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(this.projectList);
    }
}
