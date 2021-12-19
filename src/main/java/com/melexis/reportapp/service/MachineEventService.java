package com.melexis.reportapp.service;

import com.melexis.reportapp.dto.MachineEventDTO;
import org.springframework.stereotype.Service;

/**
 * Created By Moon
 * 18/12/2021, za
 **/

@Service
public interface MachineEventService {
    void save(MachineEventDTO machineEventDTO);
}
