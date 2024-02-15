package br.com.aline.collections.set.task_list;

import java.util.HashSet;
import java.util.Set;

public class TaskList {
    private Set<Task> taskSet = new HashSet<>();

    public void addTask(String description) {
        taskSet.add(new Task(description));
    }

    public void removeTask(String description) {
        Task taskToRemove = null;
        for (Task t : taskSet) {
            if(t.getDescription().equalsIgnoreCase(description)) {
                taskToRemove = t;
            }
        }
        taskSet.remove(taskToRemove);
    }

    public Set<Task> getTaskSet() {
        return taskSet;
    }

    public int getTaskCount() {
        return  taskSet.size();
    }

    public Set<Task> getFinishedTasks() {
        Set<Task> finishedTasks = new HashSet<>();
        for (Task t : taskSet) {
            if(t.isDone()) {
                finishedTasks.add(t);
            }
        }
        return  finishedTasks;
    }

    public Set<Task> getPendingTasks() {
        Set<Task> pendingTasks = new HashSet<>();
        for (Task t : taskSet) {
            if(!t.isDone()) {
                pendingTasks.add(t);
            }
        }
        return  pendingTasks;
    }

    public void markTaskAsCompleted(String description) {
        for (Task t : taskSet) {
            if (t.getDescription().equalsIgnoreCase(description)) {
                t.setDone(true);
            }
        }
    }

    public void markTaskAsPending(String description) {
        for (Task t : taskSet) {
            if (t.getDescription().equalsIgnoreCase(description)) {
                t.setDone(false);
            }
        }
    }

    public void clearTaskList() {
        taskSet.clear();
    }
}
