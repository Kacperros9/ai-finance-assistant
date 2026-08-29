package com.financeassistant.mapper;

import com.financeassistant.dto.UserResponse;
import com.financeassistant.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserResponse toResponse(User user) {
        return new UserResponse(user.getId(), user.getEmail(), user.getCreatedAt());
    }
}
