package com.voccompensation.voccompensation.common.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@Builder
@AllArgsConstructor
public class ExceptionResponse {
    private HttpStatus httpStatus;
    private String message;
}
