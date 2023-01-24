package com.voccompensation.voccompensation.controller;

import com.voccompensation.voccompensation.common.dto.ResponseDto;
import com.voccompensation.voccompensation.dto.GetVocListDto;
import com.voccompensation.voccompensation.dto.PostVocDto;
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

    public ResponseEntity<ResponseDto<PostVocDto.Response>> postVoc(PostVocDto.Request request){
        return new ResponseEntity<>(vocService.postVoc(), OK);
    }

}
