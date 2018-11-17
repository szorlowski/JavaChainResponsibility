package org.chain.responsibility.models.students;

import org.chain.responsibility.models.tasks.AbstractTask;
import org.chain.responsibility.models.tasks.TaskType;

public class MusicStudent extends AbstractStudent {

    public MusicStudent(String name) {
        super(name);
    }

    @Override
    public boolean canSolveTask(AbstractTask task) {
        return task.getType().equals(TaskType.MUSIC);
    }


    @Override
    public void solveTask(AbstractTask task) {
        if (canSolveTask(task)) {
            System.out.println(getName() + " solving task");
        } else {
            System.out.println(getName() + " cannot do it. Giving task to " + getNextStudent().getName());
            getNextStudent().solveTask(task);
        }
    }
}
