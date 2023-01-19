package com.voccompensation.voccompensation.voc.controller;

import com.voccompensation.voccompensation.common.dto.ResponseDto;
import com.voccompensation.voccompensation.voc.dto.GetVocListDto;
import com.voccompensation.voccompensation.voc.service.VocService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
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

}
