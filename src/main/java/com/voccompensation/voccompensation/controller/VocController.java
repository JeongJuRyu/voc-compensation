package com.voccompensation.voccompensation.controller;

import com.voccompensation.voccompensation.common.dto.ResponseDto;
import com.voccompensation.voccompensation.dto.*;
import com.voccompensation.voccompensation.service.VocService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/voc")
@RequiredArgsConstructor
public class VocController {
    private final VocService vocService;

    public ResponseEntity<ResponseDto<GetVocListDto.Response>> getVocList(){
        return new ResponseEntity(vocService.getVocList(), OK);
    }

    public ResponseEntity<ResponseDto<GetCompensationsDto.Response>> getCompensationList(){
        return new ResponseEntity<>(vocService.getCompensationList(), OK);
    }
    public ResponseEntity<ResponseDto<Object>> postVoc(PostVocDto.Request request){
        return new ResponseEntity<>(vocService.postVoc(request), OK);
    }

    public ResponseEntity<ResponseDto<PostPenaltyDto.Response>> postPenalty(PostPenaltyDto.Request request){
        return new ResponseEntity<>(vocService.postPenalty(request), OK);
    }

    public ResponseEntity<ResponseDto<PostCompensationDto.Response>> postCompensation(PostCompensationDto.Request request){
        return new ResponseEntity<>(vocService.postCompensation(request), OK);
    }

    public ResponseEntity<ResponseDto<PostShippingEmployeePenaltyCheckDto.Response>> PostShippingEmployeePenaltyCheck
            (PostShippingEmployeePenaltyCheckDto.Request request){
        return new ResponseEntity<>(vocService.postShippingEmployeePenaltyCheck(request), OK);
    }

}
