package com.voccompensation.voccompensation.common.database;

import com.voccompensation.voccompensation.common.enums.FaultParty;
import com.voccompensation.voccompensation.entity.*;
import com.voccompensation.voccompensation.repository.VocRepository;
import com.voccompensation.voccompensation.repository.VocRepositoryCustom;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Profile("local")
@Component
@RequiredArgsConstructor
public class InitDB {
    @PersistenceContext
    private EntityManager em;

    @EventListener(ApplicationReadyEvent.class)
    @Transactional
    public void initDB() {
        insertDummyData();
    }

    public void insertDummyData() {
        CustomerCompany customerCompany1 = CustomerCompany.builder().name("고객사1").build();
        CustomerCompany customerCompany2 = CustomerCompany.builder().name("고객사2").build();
        ShippingCompany shippingCompany1 = ShippingCompany.builder().name("운송사1").build();
        em.persist(customerCompany1);
        em.persist(shippingCompany1);

        ShippingEmployee shippingEmployee1 = ShippingEmployee.builder()
                .name("김현수")
                .salary(3000000)
                .build();
        ShippingEmployee shippingEmployee2 = ShippingEmployee.builder()
                .name("박대연")
                .salary(5000000)
                .build();
        em.persist(shippingEmployee1);

        Penalty penalty = Penalty.builder()
                            .contents("오배송")
                            .shippingEmployee(shippingEmployee1)
                            .build();


        Voc voc1 = Voc.builder()
                .contentsOfFault("오배송")
                .customerCompany(customerCompany1)
                .shippingEmployee(shippingEmployee1)
                .faultParty(FaultParty.SHIPPING)
                .build();

        Voc voc2 = Voc.builder()
                .contentsOfFault("고객사 상품 누락")
                .customerCompany(customerCompany2)
                .shippingEmployee(shippingEmployee2)
                .faultParty(FaultParty.SHIPPING)
                .build();

    }

}
