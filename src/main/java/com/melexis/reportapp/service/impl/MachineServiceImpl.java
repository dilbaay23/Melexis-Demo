package com.melexis.reportapp.service.impl;

import com.melexis.reportapp.dao.MachineRepository;
import com.melexis.reportapp.model.Machine;
import com.melexis.reportapp.service.MachineService;
import com.melexis.test.MachineType;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;


/**
 * Created By Moon
 * 18/12/2021, sat
 **/
@AllArgsConstructor
@Service
public class MachineServiceImpl implements MachineService {

    private final MachineRepository machineRepository;
    private final ModelMapper modelMapper;


    @Override
    public Machine save(Machine machine) {
        return machineRepository.save(machine);
    }

    @Override
    public void delete(String id) {
        machineRepository.deleteById(id);
    }

    @Override
    public Optional<Machine> findById(String id) {
        return machineRepository.findById(id);
    }

    @Override
    public Machine update(String id, Machine machine) {
        Machine updatedMachine = machineRepository.findById(id)
                .orElseThrow(NoSuchElementException::new);

        modelMapper.getConfiguration().setSkipNullEnabled(true);
        modelMapper.map(machine, updatedMachine);

        return updatedMachine;
    }

    @Override
    public List<Machine> findAll() {
        return machineRepository.findAll();
    }

    @Override
    public Machine getOrSave(String machineID, MachineType machineType) {
        return findById(machineID)
                .orElseGet(() -> save(new Machine(machineID, machineType)));
    }
}
