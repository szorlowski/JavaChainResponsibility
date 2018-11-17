package org.chain.responsibility.models.students;

import org.chain.responsibility.models.tasks.AbstractTask;
import org.chain.responsibility.models.tasks.TaskType;

public class ChemStudent extends AbstractStudent {

    public ChemStudent(String name) {
        super(name);
    }

    @Override
    boolean canSolveTask(AbstractTask task) {
        return task.getType().equals(TaskType.CHEM);
    }

    @Override
    public void solveTask(AbstractTask task) {
        if(canSolveTask(task)){
            System.out.println(getName() + " solving task");
        }else{
            System.out.println(getName() + " cannot do it. Giving task to " + getNextStudent().getName());
            getNextStudent().solveTask(task);
        }
    }
}
