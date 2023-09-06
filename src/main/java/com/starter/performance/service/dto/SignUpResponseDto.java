package com.starter.performance.service.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SignUpResponseDto {

    private String email;
    private String nickname;
}