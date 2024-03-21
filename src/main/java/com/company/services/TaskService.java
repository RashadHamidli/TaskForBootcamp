package com.company.services;

import com.company.dto.request.TaskRequest;
import com.company.entities.Task;
import com.company.repository.TaskRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;

    public List<Task> getAllTask() {
        return taskRepository.findAll();
    }

    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("task not found"));
    }

    @Transactional
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public Task updateTask(Long id, TaskRequest taskRequest) {
//        Task task = TaskRequest.taskRequestConverteToTask(taskRequest);
        Task foundTask = taskRepository.findById(id).orElseThrow();
        TaskRequest.updateTask(foundTask, taskRequest);
        return null;
    }
}
