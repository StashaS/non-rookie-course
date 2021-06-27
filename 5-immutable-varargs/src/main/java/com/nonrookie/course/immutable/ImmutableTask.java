package com.nonrookie.course.immutable;

public final class ImmutableTask {

    private final int id;

    private final String taskName;

    public ImmutableTask(int id, String taskName) {
        this.id = id;
        this.taskName = taskName;
    }

    public int getId() {
        return id;
    }

    public String getTaskName() {
        return taskName;
    }
}
