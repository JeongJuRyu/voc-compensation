package com.voccompensation.voccompensation.entity;

import com.voccompensation.voccompensation.common.entity.BaseTimeEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CustomerCompany {
    @Id @GeneratedValue
    private Long id;

    private String name;
}
