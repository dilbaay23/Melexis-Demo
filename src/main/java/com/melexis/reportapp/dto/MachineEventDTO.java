package com.melexis.reportapp.dto;

import com.melexis.test.ErrorType;
import com.melexis.test.MachineType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Created By Moon
 * 18/12/2021, za
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MachineEventDTO {

    private MachineType machineType;
    private String machineID;
    private LocalDateTime dateTime;
    private ErrorType errorType;

}
