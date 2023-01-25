package com.voccompensation.voccompensation.entity;

import jakarta.persistence.Column;
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
public class CustomerCompanyRepresentative {
    @Id @GeneratedValue
    private Long id;

    @Column(length = 30)
    private String name;
    @Column(length = 14)
    private String phoneNum;
}
