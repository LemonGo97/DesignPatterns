package cn.lemongo97.pattern.iterator;

import java.util.List;

public class ProjectIterator implements IProjectIterator<IProject> {

    private List<IProject> projectList;

    private int currentItem = 0;

    public ProjectIterator(List<IProject> projectList) {
        this.projectList = projectList;
    }

    @Override
    public boolean hasNext() {
        boolean isHasNext = true;
        if (this.currentItem >= projectList.size() || this.projectList.get(this.currentItem) == null) {
            isHasNext = false;
        }
        return isHasNext;
    }

    @Override
    public IProject next() {
        return this.projectList.get(this.currentItem++);
    }
}
