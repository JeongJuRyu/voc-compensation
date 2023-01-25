package com.voccompensation.voccompensation.entity;

import com.voccompensation.voccompensation.common.entity.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ShippingEmployee extends BaseTimeEntity {
    @Id @GeneratedValue
    private Long id;

    @Column(length = 30)
    private String name;

    private Integer salary;

    @OneToOne(fetch = FetchType.LAZY)
    private ShippingCompany shippingCompany;

    @OneToMany(mappedBy = "shippingEmployee", cascade = CascadeType.MERGE, orphanRemoval = true)
    private List<Penalty> penalties;
}
