package com.company.dto.responce;

import com.company.entities.Task;
import com.company.entities.User;
import lombok.Data;

import java.time.LocalDate;

@Data
public class TaskResponse {
    private String username;
    private String name;
    private String text;
    private LocalDate deadline;

    public static TaskResponse convertTaskToTaskResponse(Task task) {
        TaskResponse taskResponse = new TaskResponse();
        taskResponse.setUsername(task.getUser().getFirstName());
        taskResponse.setName(task.getName());
        taskResponse.setText(task.getText());
        taskResponse.setDeadline(task.getDeadline());
        return taskResponse;
    }
}
