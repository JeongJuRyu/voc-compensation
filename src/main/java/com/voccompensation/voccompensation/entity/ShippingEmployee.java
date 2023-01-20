package com.voccompensation.voccompensation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShippingEmployee {
    @Id @GeneratedValue
    private Long id;

    private String name;

    private Integer salary;

    @OneToMany(mappedBy = "shippingEmployee")
    private List<Penalty> penalties;
}
