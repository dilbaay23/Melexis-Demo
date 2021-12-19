package com.melexis.reportapp.controller;

import com.melexis.reportapp.model.Error;
import com.melexis.reportapp.service.ErrorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created By Moon
 * 19/12/2021, zo
 **/
@RequestMapping("error")
@RestController
@Slf4j
public class ErrorController {

    @Autowired
    private ErrorService service;


    @GetMapping("listAll")
    @PreAuthorize("hasAuthority('read')")
    public List<Error> listAll() {
        return service.findAll();
    }


}
