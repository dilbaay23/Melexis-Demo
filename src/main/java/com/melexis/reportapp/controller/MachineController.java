package com.melexis.reportapp.controller;

import com.melexis.reportapp.model.Machine;
import com.melexis.reportapp.service.MachineService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    //@PreAuthorize("hasAuthority('read')")
    public List<Machine> listAll() {
        return service.findAll();
    }

    @PostMapping("addMachine")
    Machine save(@RequestBody Machine machine) {
        return service.save(machine);
    }

    @GetMapping("/listAll/{id}")
    public Machine get(@PathVariable("id") String id) {
        return service.findById(id).orElseGet(null);
    }


}
