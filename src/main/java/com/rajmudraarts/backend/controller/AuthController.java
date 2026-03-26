package com.rajmudraarts.backend.controller;

import com.rajmudraarts.backend.model.User;
import com.rajmudraarts.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody User user) {
        return ResponseEntity.ok(userService.signup(user));
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Map<String, String> credentials) {
        String token = userService.login(credentials.get("email"), credentials.get("password"));
        return ResponseEntity.ok(token);
    }

    @GetMapping("/profile")
    public ResponseEntity<User> getProfile(org.springframework.security.core.Authentication authentication) {
        Object principal = authentication.getPrincipal();

        if (principal instanceof User) {
            User user = (User) principal;
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.status(403).build(); // fallback if not authenticated
        }
    }

    @PutMapping("/profile")
    public ResponseEntity<User> updateProfile(org.springframework.security.core.Authentication authentication,
                                              @RequestBody User updatedUser) {
        Object principal = authentication.getPrincipal();

        if (principal instanceof User) {
            User user = (User) principal;
            User updated = userService.updateProfile(user.getEmail(), updatedUser);
            return ResponseEntity.ok(updated);
        } else {
            return ResponseEntity.status(403).build();
        }
    }

}