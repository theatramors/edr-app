package com.amors.edrapp.services;

import com.amors.edrapp.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    private Map<String, UserDto> userDtoMap;

    public UserService() {
        userDtoMap = new HashMap<String, UserDto>() {{
           put("John", UserDto.builder().username("John").email("john@mail.com").build());
           put("Mike", UserDto.builder().username("Mike").email("mike@mail.com").build());
        }};
    }

    public void add(UserDto dto) {
        if (null != dto) {
            userDtoMap.put(dto.getUsername(), dto);
        }
    }

    public List<UserDto> get() {
        return new ArrayList<>(userDtoMap.values());
    }
}
