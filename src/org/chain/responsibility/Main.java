package org.chain.responsibility;

import org.chain.responsibility.models.tasks.Task;
import org.chain.responsibility.models.tasks.TaskType;
import org.chain.responsibility.services.StudentFactory;
import org.chain.responsibility.services.TaskService;

public class Main {
    public static void main(String[] args) {
        TaskService.solveTask(StudentFactory.getStudents(), new Task(TaskType.MUSIC));
    }
}
