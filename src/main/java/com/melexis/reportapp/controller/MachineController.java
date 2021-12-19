package com.melexis.reportapp.controller;

import com.melexis.reportapp.model.Machine;
import com.melexis.reportapp.service.MachineService;
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

@RestController
@RequestMapping("machine")
@Slf4j
public class MachineController {

    @Autowired
    private MachineService service;

    @GetMapping("listAll")
    @PreAuthorize("hasAuthority('read')")
    public List<Machine> listAll() {
        return service.findAll();
    }
}
