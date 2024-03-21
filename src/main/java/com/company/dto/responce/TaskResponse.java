package com.company.dto.responce;

import com.company.entities.Task;
import lombok.Data;

import java.time.LocalDate;

@Data
public class TaskResponse {
    private String name;
    private String text;
    private LocalDate deadline;

    public static TaskResponse convertTaskToTaskResponse(Task task) {
        TaskResponse taskResponse = new TaskResponse();
        taskResponse.setName(task.getName());
        taskResponse.setText(task.getText());
        taskResponse.setDeadline(task.getDeadline());
        return taskResponse;
    }
}
