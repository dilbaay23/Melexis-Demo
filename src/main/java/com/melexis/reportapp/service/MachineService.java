package com.melexis.reportapp.service;

import com.melexis.reportapp.model.Machine;
import com.melexis.test.MachineType;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


/**
 * Created By Moon
 * 18/12/2021, za
 **/
@Service
public interface MachineService {

    Machine save(Machine machine);

    void delete(String id);

    Optional<Machine> findById(String id);

    Machine update(String id, Machine machine);

    List<Machine> findAll();

    Machine getOrSave(String machineID, MachineType machineType);
}
