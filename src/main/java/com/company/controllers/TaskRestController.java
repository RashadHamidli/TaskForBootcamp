package com.company.controllers;

import com.company.dto.request.TaskRequest;
import com.company.dto.responce.TaskResponse;
import com.company.entities.Task;
import com.company.services.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@RequiredArgsConstructor
public class TaskRestController {
    private final TaskService taskService;

    @GetMapping("/all")
    public List<TaskResponse> getAllTask() {
        return taskService.getAllTask();
    }

    @GetMapping("/{id}")
    public TaskResponse getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }

    @PostMapping
    public TaskResponse creatTask(@RequestBody TaskRequest taskRequest) {
        return taskService.createTask(taskRequest);
    }

    @PutMapping("/{id}")
    public TaskResponse updateTask(@PathVariable Long id, @RequestBody TaskRequest task) {
        return taskService.updateTask(id, task);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletedTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return ResponseEntity.ok("tasked deleted successfully");
    }
}
