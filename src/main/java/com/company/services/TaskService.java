package com.company.services;

import com.company.dto.request.TaskRequest;
import com.company.dto.responce.TaskResponse;
import com.company.entities.Task;
import com.company.repository.TaskRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;

    public List<TaskResponse> getAllTask() {
        List<Task> all = taskRepository.findAll();
        return all.stream().map(TaskResponse::convertTaskToTaskResponse).collect(Collectors.toList());
    }

    public TaskResponse getTaskById(Long id) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("task not found"));
        return TaskResponse.convertTaskToTaskResponse(task);
    }

    @Transactional
    public TaskResponse createTask(TaskRequest taskRequest) {
        Task task = TaskRequest.taskRequestConverteToTask(taskRequest);
        Task savedTask = taskRepository.save(task);
        return TaskResponse.convertTaskToTaskResponse(savedTask);
    }

    @Transactional
    public TaskResponse updateTask(Long id, TaskRequest taskRequest) {
        Task task = TaskRequest.taskRequestConverteToTask(taskRequest);
        Task foundTask = taskRepository.findById(id).orElseThrow();
        Task updateTask = TaskRequest.updateTask(foundTask, task);
        return TaskResponse.convertTaskToTaskResponse(updateTask);
    }

    @Transactional
    public boolean deleteTask(Long id) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("task cannot find"));
        taskRepository.delete(task);
        return true;
    }
}
