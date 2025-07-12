package com.example.rt_tasker.controller;

import com.example.rt_tasker.dto.ProjectDTO;
import com.example.rt_tasker.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/projects")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody ProjectDTO dto) {
        return ResponseEntity.ok(projectService.create(dto));
    }

    @GetMapping
    public ResponseEntity<?> all() {
        return ResponseEntity.ok(projectService.getAll());
    }
}
