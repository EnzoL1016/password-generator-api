package com.example.password_generator_api.controller;

import com.example.password_generator_api.model.PasswordRequest;
import com.example.password_generator_api.service.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api"})
public class PasswordController {
    @Autowired
    private PasswordService passwordService;

    public PasswordController() {
    }

    @PostMapping({"/generate-password"})
    public ResponseEntity<?> generatePassword(@RequestBody PasswordRequest request) {
        try {
            String password = this.passwordService.generatePassword(request);
            return ResponseEntity.ok(new PasswordResponse(true, password));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(new PasswordResponse(false, e.getMessage()));
        }
    }

    private static class PasswordResponse {
        private boolean success;
        private String message;

        public PasswordResponse(boolean success, String message) {
            this.success = success;
            this.message = message;
        }

        public boolean isSuccess() {
            return this.success;
        }

        public String getMessage() {
            return this.message;
        }
    }
}
