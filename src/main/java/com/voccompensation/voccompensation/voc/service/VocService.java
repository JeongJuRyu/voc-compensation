package com.voccompensation.voccompensation.voc.service;

import com.voccompensation.voccompensation.common.dto.ResponseDto;
import com.voccompensation.voccompensation.voc.dto.GetVocListDto;
import com.voccompensation.voccompensation.voc.repository.VocRepositoryCustom;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VocService {
    private final VocRepositoryCustom vocRepositoryCustom;
    public ResponseDto<GetVocListDto.Response> getVocList(){
        return null;
    }
}
