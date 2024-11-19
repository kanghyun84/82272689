package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")

  public class UserController {
    @GetMapping("/user")
    public Map<String, Object> getUserId() {
        Map<String, Object> response = new HashMap<>();
        response.put("사번", 82272689); // 사번 값을 여기에 입력합니다.
        return response;
    }
}
