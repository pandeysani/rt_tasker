package com.example.rt_tasker.controller;

import com.example.rt_tasker.dto.TaskDTO;
import com.example.rt_tasker.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody TaskDTO dto) {
        return ResponseEntity.ok(taskService.create(dto));
    }

    @GetMapping("/project/{id}")
    public ResponseEntity<?> getByProject(@PathVariable Long id) {
        return ResponseEntity.ok(taskService.getTasksByProject(id));
    }
}
