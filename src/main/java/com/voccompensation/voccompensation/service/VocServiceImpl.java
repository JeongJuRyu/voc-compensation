package com.voccompensation.voccompensation.service;

import com.voccompensation.voccompensation.common.dto.ResponseDto;
import com.voccompensation.voccompensation.dto.*;
import com.voccompensation.voccompensation.repository.VocRepositoryCustom;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VocServiceImpl implements VocService{
    private final VocRepositoryCustom vocRepositoryCustom;
    public ResponseDto<GetVocListDto.Response> getVocList(){
        return null;
    }
    @Override
    public ResponseDto<Object> postVoc(PostVocDto.Request request) {
        return null;
    }

    @Override
    public ResponseDto<GetCompensationsDto.Response> getCompensationList() {
        return null;
    }

    @Override
    public ResponseDto<PostCompensationDto.Response> postCompensation(PostCompensationDto.Request request) {
        return null;
    }

    @Override
    public ResponseDto<PostPenaltyDto.Response> postPenalty(PostPenaltyDto.Request request) {
        return null;
    }

    @Override
    public ResponseDto<PostShippingEmployeePenaltyCheckDto.Response> postShippingEmployeePenaltyCheck(PostShippingEmployeePenaltyCheckDto.Request request) {
        return null;
    }
}
