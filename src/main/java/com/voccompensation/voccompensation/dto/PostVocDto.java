package com.voccompensation.voccompensation.dto;

import com.voccompensation.voccompensation.common.enums.FaultParty;
import lombok.Builder;
import lombok.Getter;

public class PostVocDto {
    @Getter
    public static class Request {
        private FaultParty faultParty;
        private String contentsOfFault;
        private String customerCompanyId;
        private String shippingEmployeeId;
    }
}
