package com.example.mbtiapi.api.user;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/user/mbti")
    public String getUserMbtiInfo(int userId) throws Exception {
        return userService.getUserMbti(userId);
    }
}
