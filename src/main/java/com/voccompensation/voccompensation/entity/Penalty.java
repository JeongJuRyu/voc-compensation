package com.voccompensation.voccompensation.entity;

import com.voccompensation.voccompensation.common.entity.BaseTimeEntity;
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
public class Penalty extends BaseTimeEntity {
    @Id @GeneratedValue
    private Long id;

    private String contents;

    @Builder.Default
    private Boolean isCheckedByDriver = Boolean.FALSE;

    @Builder.Default
    private Boolean isComplainedByDriver = Boolean.FALSE;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private ShippingEmployee shippingEmployee;
}
