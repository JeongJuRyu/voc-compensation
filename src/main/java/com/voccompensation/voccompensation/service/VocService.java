package com.voccompensation.voccompensation.service;

import com.voccompensation.voccompensation.common.dto.ResponseDto;
import com.voccompensation.voccompensation.dto.GetVocListDto;
import com.voccompensation.voccompensation.dto.PostVocDto;
import com.voccompensation.voccompensation.repository.VocRepositoryCustom;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


public interface VocService {
    /**
     * 등록된 Voc의 List 조회
     */
    public ResponseDto<GetVocListDto.Response> getVocList();

    /**
     * Voc를 등록
     */
    public ResponseDto<PostVocDto.Response> postVoc();
}
