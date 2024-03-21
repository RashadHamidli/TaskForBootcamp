package com.company.dto.request;

import com.company.entities.Task;
import lombok.Data;

import java.time.LocalDate;
import java.util.Optional;

@Data
public class TaskRequest {
    private String name;
    private String text;
    private LocalDate deadline;


    public static Task updateTask(Task task, TaskRequest taskRequest) {
        Optional.ofNullable(task.getName()).ifPresent(taskRequest::setName);
        Optional.ofNullable(task.getText()).ifPresent(taskRequest::setText);
        Optional.ofNullable(task.getDeadline()).ifPresent(taskRequest::setDeadline);
        return task;
    }

    public static Task taskRequestConverteToTask(TaskRequest taskRequest) {
        Task task = new Task();
        task.setName(taskRequest.name);
        task.setText(taskRequest.text);
        task.setDeadline(taskRequest.deadline);
        return task;
    }
}
