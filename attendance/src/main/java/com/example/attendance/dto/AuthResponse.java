package com.example.attendance.dto;

public class AuthResponse {
    private final String jwt;
    private final String role;

    public AuthResponse(String jwt, String role) {
        this.jwt = jwt;
        this.role = role;
    }

    // Getters
    public String getJwt() { return jwt; }
    public String getRole() { return role; }
}
