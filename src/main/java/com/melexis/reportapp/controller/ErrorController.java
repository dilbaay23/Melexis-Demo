package com.melexis.reportapp.controller;

import com.melexis.reportapp.model.Error;
import com.melexis.reportapp.service.ErrorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    // @PreAuthorize("hasAuthority('read')")
    public List<Error> listAll() {
        return service.findAll();
    }

    @GetMapping("{id}")
    public Error get(@PathVariable("id") String id) {
        return service.findById(id);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") String id) {
        try {
            service.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
