package com.voccompensation.voccompensation.voc.entity;


import com.voccompensation.voccompensation.common.entity.BaseTimeEntity;
import com.voccompensation.voccompensation.common.enums.FaultParty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Voc extends BaseTimeEntity {
    @Id @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    private FaultParty faultParty;



}
