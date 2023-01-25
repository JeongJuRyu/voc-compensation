package com.voccompensation.voccompensation.service;

import com.voccompensation.voccompensation.common.dto.ResponseDto;
import com.voccompensation.voccompensation.dto.*;
import com.voccompensation.voccompensation.repository.VocRepositoryCustom;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import static org.springframework.http.HttpStatus.OK;


public interface VocService {
    /**
     * 등록된 Voc의 List 조회
     */
    public ResponseDto<GetVocListDto.Response> getVocList();


    /**
     * Voc를 등록
     */
    public ResponseDto<Object> postVoc(PostVocDto.Request request);

    /**
     * 배상 목록을 조회
     */
    public ResponseDto<GetCompensationsDto.Response> getCompensationList();

    /**
     * 배상 정보를 등록
     */
    public ResponseDto<PostCompensationDto.Response> postCompensation(PostCompensationDto.Request request);

    /**
     * 패널티를 등록
     */
    public ResponseDto<PostPenaltyDto.Response> postPenalty(PostPenaltyDto.Request request);

    /**
     * 배송기사의 패널티 확인 여부를 등록
     */
    public ResponseDto<PostShippingEmployeePenaltyCheckDto.Response> postShippingEmployeePenaltyCheck
            (PostShippingEmployeePenaltyCheckDto.Request request);
}
