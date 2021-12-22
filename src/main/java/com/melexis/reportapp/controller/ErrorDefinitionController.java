package com.melexis.reportapp.controller;

import com.melexis.reportapp.model.ErrorDefinition;
import com.melexis.reportapp.service.ErrorDefinitionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created By Moon
 * 19/12/2021, zo
 **/
@RequestMapping("errorDefinition")
@RestController
@Slf4j
public class ErrorDefinitionController {

    @Autowired
    private ErrorDefinitionService service;

    //TODO:
    @GetMapping("query")
    //@PreAuthorize("hasAuthority('read')")
    public List<ErrorDefinition> query() {

        return service.findAll();
    }

    @PostMapping("/addErrorDefinition")
    ErrorDefinition save(@RequestBody ErrorDefinition errorDefinition) {
        return service.save(errorDefinition);
    }

}
