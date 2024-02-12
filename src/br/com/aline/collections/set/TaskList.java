package br.com.aline.collections.set;

import java.util.HashSet;
import java.util.Set;

public class TaskList {
    private Set<Task> taskSet = new HashSet<>();

    void addTask(String description) {
        taskSet.add(new Task(description));
    }

    void removeTask(String description) {
        Task taskToRemove = null;
        for (Task t : taskSet) {
            if(t.getDescription().equalsIgnoreCase(description)) {
                taskToRemove = t;
            }
        }
        taskSet.remove(taskToRemove);
    }

    Set<Task> getTaskSet() {
        return taskSet;
    }

    int getTaskCount() {
        return  taskSet.size();
    }

    Set<Task> getFinishedTasks() {
        Set<Task> finishedTasks = new HashSet<>();
        for (Task t : taskSet) {
            if(t.isDone()) {
                finishedTasks.add(t);
            }
        }
        return  finishedTasks;
    }

    Set<Task> getPendingTasks() {
        Set<Task> pendingTasks = new HashSet<>();
        for (Task t : taskSet) {
            if(!t.isDone()) {
                pendingTasks.add(t);
            }
        }
        return  pendingTasks;
    }

    void markTaskAsCompleted(String description) {
        for (Task t : taskSet) {
            if (t.getDescription().equalsIgnoreCase(description)) {
                t.setDone(true);
            }
        }
    }

    void markTaskAsPending(String description) {
        for (Task t : taskSet) {
            if (t.getDescription().equalsIgnoreCase(description)) {
                t.setDone(false);
            }
        }
    }

    void clearTaskList() {
        taskSet.clear();
    }
}
