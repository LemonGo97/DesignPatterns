package cn.lemongo97.pattern.iterator;

import java.text.MessageFormat;

public class Starter {

    public static void main(String[] args) {
        IProject project = new Project();
        for (int i = 0; i < 1000; i++) {
            project.add(MessageFormat.format("项目{0}",i+1),i*5,i*100);
        }
        IProjectIterator<IProject> projectIterator = project.iterator();
        while (projectIterator.hasNext()){
            IProject next = projectIterator.next();
            System.out.println(next.getProjectInfo());
        }
    }

}
