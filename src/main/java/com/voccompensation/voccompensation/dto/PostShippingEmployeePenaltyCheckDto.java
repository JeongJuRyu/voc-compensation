package com.voccompensation.voccompensation.dto;

import lombok.Builder;
import lombok.Getter;

public class PostShippingEmployeePenaltyCheckDto {
    @Getter
    public static class Request {
        private String contents;
    }
    @Builder
    public static class Response {

    }
}
