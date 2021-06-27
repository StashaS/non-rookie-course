package com.nonrookie.course.immutable;

public class MutableTask {

    public int id;

    private String taskName;

    public MutableTask(int id, String taskName) {
        this.id = id;
        this.taskName = taskName;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
}
