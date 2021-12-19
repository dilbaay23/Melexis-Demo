package com.melexis.reportapp.service.impl;

import com.melexis.reportapp.dto.MachineEventDTO;
import com.melexis.reportapp.model.Error;
import com.melexis.reportapp.model.ErrorDefinition;
import com.melexis.reportapp.model.Machine;
import com.melexis.reportapp.service.ErrorDefinitionService;
import com.melexis.reportapp.service.ErrorService;
import com.melexis.reportapp.service.MachineEventService;
import com.melexis.reportapp.service.MachineService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created By Moon
 * 18/12/2021, za
 **/

@Service
@AllArgsConstructor
@Slf4j
public class MachineEventServiceImpl implements MachineEventService {

    private final ErrorService errorService;
    private final MachineService machineService;
    private final ErrorDefinitionService errorDefinitionService;


    @Override
    public void save(MachineEventDTO machineEventDTO) {
        Machine machine = machineService.getOrSave(machineEventDTO.getMachineID(), machineEventDTO.getMachineType());

        ErrorDefinition errorDefinition = errorDefinitionService
                .getOrSave(machineEventDTO.getErrorType().ordinal(), machineEventDTO.getErrorType().getErrorDescription());

        Error error = new Error(UUID.randomUUID(), machine, errorDefinition, machineEventDTO.getDateTime());
        errorService.save(error);

    }
}
