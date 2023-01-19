package com.voccompensation.voccompensation.common.dto;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.voccompensation.voccompensation.common.code.ResponseCode;

public class ResponseDto<T> {
    private ResponseCode responseCode;
    @JsonUnwrapped
    private T data;
}
