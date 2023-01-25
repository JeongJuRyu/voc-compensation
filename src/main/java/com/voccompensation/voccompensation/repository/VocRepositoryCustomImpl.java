package com.voccompensation.voccompensation.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.voccompensation.voccompensation.entity.QVoc;
import com.voccompensation.voccompensation.entity.Voc;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.voccompensation.voccompensation.entity.QVoc.*;

@Repository
@RequiredArgsConstructor
public class VocRepositoryCustomImpl implements VocRepositoryCustom{
    private final JPAQueryFactory queryFactory;
    @Override
    public List<Voc> getVocList() {
        return queryFactory
                .selectFrom(voc)
                .fetch();
    }
}
