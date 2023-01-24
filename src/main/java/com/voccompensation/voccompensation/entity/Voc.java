package com.voccompensation.voccompensation.entity;


import com.voccompensation.voccompensation.common.entity.BaseTimeEntity;
import com.voccompensation.voccompensation.common.enums.FaultParty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Voc extends BaseTimeEntity {
    @Id @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    private FaultParty faultParty;

    private String contentsOfFault;

    private Boolean isCheckedByDriver;

    private Boolean isComplainedByDriver;

}
