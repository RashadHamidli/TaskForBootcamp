package com.company.dto.responce;

import com.company.entities.Task;
import com.company.entities.User;
import lombok.Data;

import java.time.LocalDate;

@Data
public class TaskResponse {
    private String name;
    private String text;
    private LocalDate deadline;
    private String username;

    public static TaskResponse convertTaskToTaskResponse(Task task, String username) {
        TaskResponse taskResponse = new TaskResponse();
        taskResponse.setUsername(username);
        taskResponse.setName(task.getName());
        taskResponse.setText(task.getText());
        taskResponse.setDeadline(task.getDeadline());
        return taskResponse;
    }
}
