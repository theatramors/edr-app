package com.amors.edrapp.dto;

import com.amors.edrapp.entity.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDto {
    private String username;
    private String email;

    public static UserDto fromEntity(User entity) {
        return UserDto.builder()
            .username(entity.getUsername())
            .email(entity.getEmail())
            .build();
    }

    @Override
    public String toString() {
        return String.format("{username = %s, email = %s}", username, email);
    }
}
