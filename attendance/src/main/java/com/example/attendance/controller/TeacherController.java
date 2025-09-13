package com.example.attendance.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/teacher")
public class TeacherController {

    @GetMapping("/students")
    public ResponseEntity<String> getStudents() {
        return ResponseEntity.ok("Teacher has access to view all students.");
    }
}
