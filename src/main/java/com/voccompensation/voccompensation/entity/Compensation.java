package com.voccompensation.voccompensation.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Compensation{
    @Id @GeneratedValue
    private Long id;

    private Integer amount;
}
