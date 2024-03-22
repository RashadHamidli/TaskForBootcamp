package com.company.controllers;

import com.company.dto.request.TaskRequest;
import com.company.dto.responce.TaskResponse;
import com.company.entities.Task;
import com.company.services.TaskService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@AllArgsConstructor
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
    @ResponseStatus(HttpStatus.CREATED)
    public TaskResponse creatTask(@RequestBody TaskRequest taskRequest) {
        return taskService.createTask(taskRequest);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public TaskResponse updateTask(@PathVariable Long id, @RequestBody TaskRequest task) {
        return taskService.updateTask(id, task);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletedTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return ResponseEntity.ok("tasked deleted successfully");
    }
}
