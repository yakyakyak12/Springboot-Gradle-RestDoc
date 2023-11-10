package com.example.restdocapp.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class UserController {

    @GetMapping("/join")
    public ResponseEntity<?> join() {
        return ResponseEntity.ok().body(null);
    }

}
