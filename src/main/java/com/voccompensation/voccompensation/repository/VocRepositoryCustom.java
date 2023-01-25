package com.voccompensation.voccompensation.repository;

import com.voccompensation.voccompensation.entity.Voc;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface VocRepositoryCustom {
    List<Voc> getVocList();
}
