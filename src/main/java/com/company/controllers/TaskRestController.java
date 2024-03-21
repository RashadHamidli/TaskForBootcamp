package com.company.controllers;

import com.company.dto.request.TaskRequest;
import com.company.entities.Task;
import com.company.services.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskRestController {
    private final TaskService taskService;

    @GetMapping
    public List<Task> getAllTask() {
        return taskService.getAllTask();
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }

    @PostMapping
    public Task creatTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @PutMapping("/id")
    public Task updateTask(@PathVariable Long id, @RequestBody TaskRequest task) {
        return taskService.updateTask(id, task);
    }
}
