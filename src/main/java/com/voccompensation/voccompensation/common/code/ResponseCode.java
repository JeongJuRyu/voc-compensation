package com.voccompensation.voccompensation.common.code;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ResponseCode {
    GET_VOC_LIST("Success", "V001", "Get voc list", "voc 리스트 조회");
    private String status;
    private String code;
    private String message;
    private String description;
}
