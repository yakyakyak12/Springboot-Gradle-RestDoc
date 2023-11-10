package com.example.restdocapp.user;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

public class UserRequest {

    @Data
    public static class JoinDTO {

        @Size(min = 3, max = 20)
        @NotEmpty
        private String username;

        @Size(min = 4, max = 20)
        @NotEmpty
        private String password;

        @Size(min = 10, max = 100)
        @NotEmpty
        private String email;

        public User toEntity() {
            return User.builder()
                    .username(username)
                    .password(password)
                    .email(email)
                    .build();
        }
    }

    @Data
    public static class LoginDTO {

        @Size(min = 3, max = 20)
        @NotEmpty
        private String username;

        @Size(min = 4, max = 20)
        @NotEmpty
        private String password;

        @Size(min = 15, max = 100)
        @NotEmpty
        private String email;
    }

}
