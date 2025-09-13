package com.example.attendance.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @GetMapping("/attendance")
    public ResponseEntity<String> getStudentAttendance() {
        return ResponseEntity.ok("Student attendance record retrieved successfully.");
    }
}
