package com.shivang.github.dashboard.backend.service;

import com.shivang.github.dashboard.backend.dto.response.UserInfoResponse;

public interface UserService {

    UserInfoResponse fetchUserDetails(String username);

}
