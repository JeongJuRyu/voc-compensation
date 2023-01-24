package com.voccompensation.voccompensation.service;

import com.voccompensation.voccompensation.common.dto.ResponseDto;
import com.voccompensation.voccompensation.dto.GetVocListDto;
import com.voccompensation.voccompensation.dto.PostVocDto;
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
    public ResponseDto<PostVocDto.Response> postVoc(){
        return null;
    }
}
