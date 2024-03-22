package com.company.services;

import com.company.config.AuthenticationConfig;
import com.company.dto.request.TaskRequest;
import com.company.dto.responce.TaskResponse;
import com.company.entities.Task;
import com.company.entities.User;
import com.company.repository.TaskRepository;
import com.company.repository.UserRepository;
import com.company.security.CustomSecurityContext;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;
    private final CustomSecurityContext securityContext;
    private final UserRepository userRepository;

    private User getLoginUser() {
        String user = securityContext.getSecurityContext();
        return userRepository.findByEmail(user).orElseThrow(() -> new UsernameNotFoundException("user not found"));
    }

    @Transactional
    public List<TaskResponse> getAllTask() {
        User loginUser = getLoginUser();
        List<Task> allTask = taskRepository.findAll();
        return allTask.stream().map(TaskResponse::convertTaskToTaskResponse).collect(Collectors.toList());
    }

    @Transactional
    public TaskResponse getTaskById(Long id) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("task not found"));
        return TaskResponse.convertTaskToTaskResponse(task);
    }

    @Transactional
    public TaskResponse createTask(TaskRequest taskRequest) {
        User loginUser = getLoginUser();
        Task task = TaskRequest.taskRequestConverteToTask(taskRequest);
        task.setUser(loginUser);
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
