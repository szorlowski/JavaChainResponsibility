package org.chain.responsibility.services;

import org.chain.responsibility.models.students.AbstractStudent;
import org.chain.responsibility.models.tasks.AbstractTask;

import java.util.List;

public class TaskService {
    public static void solveTask(List<AbstractStudent> list, AbstractTask task){
        list.get(0).solveTask(task);
    }
}
