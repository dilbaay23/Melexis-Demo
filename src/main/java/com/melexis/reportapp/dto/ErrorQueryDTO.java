package com.melexis.reportapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Created By Moon
 * 23/12/2021, do
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorQueryDTO {

    private String machineId;
    private Integer errorCode;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

}
