package com.melexis.reportapp.controller;

import com.melexis.reportapp.model.Machine;
import com.melexis.reportapp.service.MachineService;
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

    @GetMapping("{id}")
    public Machine get(@PathVariable("id") String id) {
        return service.findById(id).orElseGet(null);
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
