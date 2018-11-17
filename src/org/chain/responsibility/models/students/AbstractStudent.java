package org.chain.responsibility.models.students;

import org.chain.responsibility.models.tasks.AbstractTask;

public abstract class AbstractStudent {
    private String name;
    private AbstractStudent nextStudent;

    AbstractStudent(String name) {
        this.name = name;
    }

    abstract boolean canSolveTask(AbstractTask task);

    public abstract void solveTask(AbstractTask task);

    String getName() {
        return name;
    }

    public void setNextStudent(AbstractStudent nextStudent) {
        this.nextStudent = nextStudent;
    }

    AbstractStudent getNextStudent() {
        return nextStudent;
    }
}
