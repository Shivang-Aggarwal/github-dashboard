package com.shivang.github.dashboard.backend.service;

import com.shivang.github.dashboard.backend.domain.UserInfo;
import com.shivang.github.dashboard.backend.dto.response.UserInfoResponse;
import com.shivang.github.dashboard.backend.mapper.UserInfoMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    private UserInfo mockUser1 = UserInfo.builder()
            .username("ketchash")
            .firstName("Ash")
            .lastName("Ketchum")
            .imageURL("https://www.pngall.com/ash-png/")
            .shortDescription("World Champion Pokémon Trainer")
            .longDescription("Home: Pallet Town\nFavorite Pokémon: Pikatchu ⚡\nRival: Gary Oak")
            .build();

    @Override
    public UserInfoResponse fetchUserDetails(String username) {
        switch (username) {
            case "ketchash":
                return UserInfoMapper.entityMapper(mockUser1);
            default:
                log.error("No user with username: {}", username);
                throw new RuntimeException("username: " + username + " not found!");
        }
    }

}
