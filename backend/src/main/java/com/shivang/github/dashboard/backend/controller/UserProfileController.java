package com.shivang.github.dashboard.backend.controller;

import com.shivang.github.dashboard.backend.dto.response.UserInfoResponse;
import com.shivang.github.dashboard.backend.service.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/api/v1/users")
@RestController
public class UserProfileController {

    private final UserServiceImpl userService;

    @GetMapping("/{username}")
    public ResponseEntity<UserInfoResponse> getUserDetails(@PathVariable String username) {
        return ResponseEntity.ok(userService.fetchUserDetails(username));
    }

}
