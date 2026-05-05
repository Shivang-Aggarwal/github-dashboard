package com.shivang.github.dashboard.backend.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class UserInfo {

    private String username;
    private String firstName;
    private String lastName;
    private String imageURL;
    private String shortDescription;
    private String longDescription;

}
