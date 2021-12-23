package com.melexis.reportapp.controller;

import com.melexis.reportapp.dto.ErrorQueryDTO;
import com.melexis.reportapp.model.Error;
import com.melexis.reportapp.service.ErrorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created By Moon
 * 23/12/2021, do
 **/
@RestController
@RequestMapping("report")
public class ReportController {
    @Autowired
    private ErrorService errorService;

    @PostMapping("/query")
    public List<Error> query(@RequestBody ErrorQueryDTO queryDTO) {
        return errorService.query(queryDTO);
    }
}
