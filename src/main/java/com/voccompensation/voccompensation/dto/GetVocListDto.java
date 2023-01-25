package com.voccompensation.voccompensation.dto;


import lombok.Builder;
import lombok.Getter;

import java.util.List;

public class GetVocListDto {
    @Builder
    public static class Response {
        private List<Voc> vocList;

        @Builder
        public static class Voc {
            private String faultParty;

            private String contentsOfFault;

            private Boolean isCheckedByDriver;

            private Boolean isComplainedByDriver;

            private Compensation compensation;

            public static class Compensation {
                private Integer amount;
            }
        }
    }
}
