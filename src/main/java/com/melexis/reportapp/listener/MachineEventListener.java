package com.melexis.reportapp.listener;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.melexis.reportapp.dto.MachineEventDTO;
import com.melexis.reportapp.service.MachineEventService;
import lombok.AllArgsConstructor;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Created By Moon
 * 18/12/2021, za
 **/
@Component
@AllArgsConstructor
public class MachineEventListener {

    private final MachineEventService machineEventService;
    private final ObjectMapper objectMapper;

    @JmsListener(destination = "machine.event")
    public void receiveMessage(String content) {
        try {
            MachineEventDTO machineEventDTO = objectMapper.readValue(content, MachineEventDTO.class);
            machineEventService.save(machineEventDTO);
            System.out.println("Received <" + machineEventDTO.getMachineID() + ">");
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }


}
