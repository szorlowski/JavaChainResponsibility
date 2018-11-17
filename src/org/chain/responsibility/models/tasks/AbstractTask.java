package org.chain.responsibility.models.tasks;

public abstract class AbstractTask {

    private TaskType type;

    public AbstractTask(TaskType type) {
        this.type = type;
    }

    public TaskType getType() {
        return type;
    }
}
