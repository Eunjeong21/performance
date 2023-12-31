package com.starter.performance.service.dto;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MemberProfileResponseDto {
    private String email;
    private String phoneNumber;
    private String nickname;
    private LocalDateTime registeredDate;
    private LocalDateTime modifiedDate;
    private String rating;
}
