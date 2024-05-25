package org.example;

import java.util.ArrayList;
import java.util.List;

public class OnTrackTaskFactory {
    public static OnTrackTaskModel createTask(String studentId, String taskName, String taskDescription, String taskDueDate, String taskStatus) {
        return new OnTrackTaskModel(studentId, taskName, taskDescription, taskDueDate, taskStatus);
    }

    public static List<OnTrackTaskModel> createTaskList() {
        List<OnTrackTaskModel> taskList = new ArrayList<>();
        taskList.add(createTask("0012", "Task 1", "Description 1", "2021-01-01", "Not Started"));
        taskList.add(createTask("0012", "Task 2", "Description 2", "2021-02-02", "In Progress"));
        taskList.add(createTask("0012", "Task 3", "Description 3", "2021-03-03", "Completed"));
        return taskList;
    }

    public static List<OnTrackTaskModel> getTaskList() {
        return createTaskList();
    }

    public static List<OnTrackTaskModel> getTasks(String studentId) {
        return getTaskList().stream().filter(task -> task.getStudentId().equals(studentId)).toList();
    }
}
