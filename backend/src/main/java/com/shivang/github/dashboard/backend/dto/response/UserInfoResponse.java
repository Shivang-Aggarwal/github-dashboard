package com.shivang.github.dashboard.backend.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public record UserInfoResponse(
        @JsonProperty("firstName") String firstName,
        @JsonProperty("lastName") String lastName,
        @JsonProperty("imageURL") String imageURL,
        @JsonProperty("shortDescription") String shortDescription,
        @JsonProperty("longDescription") String longDescription
) {
}
