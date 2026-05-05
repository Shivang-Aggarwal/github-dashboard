package com.shivang.github.dashboard.backend.mapper;

import com.shivang.github.dashboard.backend.domain.UserInfo;
import com.shivang.github.dashboard.backend.dto.response.UserInfoResponse;

public class UserInfoMapper {

    public static UserInfoResponse entityMapper(UserInfo user) {
        return new UserInfoResponse(
                user.getFirstName(),
                user.getLastName(),
                user.getImageURL(),
                user.getShortDescription(),
                user.getLongDescription()
        );
    }

}
