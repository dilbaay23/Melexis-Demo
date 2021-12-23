package com.melexis.reportapp.service.impl;


import com.melexis.reportapp.dao.ErrorRepository;
import com.melexis.reportapp.dto.ErrorQueryDTO;
import com.melexis.reportapp.model.Error;
import com.melexis.reportapp.service.ErrorService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.NoSuchElementException;


/**
 * Created By Moon
 * 18/12/2021, za
 **/

@AllArgsConstructor
@Service
@Slf4j
public class ErrorServiceImpl implements ErrorService {

    private final ErrorRepository errorRepository;
    private final ModelMapper modelMapper;


    @Override
    public Error save(Error error) {
        return errorRepository.save(error);
    }

    @Override
    public void delete(String id) {
        errorRepository.deleteById(id);
    }

    @Override
    public Error findById(String id) {
        return errorRepository.findById(id)
                .orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Error update(String id, Error error) {
        Error updatedError = errorRepository.findById(id)
                .orElseThrow(NoSuchElementException::new);

        modelMapper.getConfiguration().setSkipNullEnabled(true);
        modelMapper.map(error, updatedError);

        return updatedError;
    }

    @Override
    public List<Error> findAll() {
        return errorRepository.findAll();
    }

    @Override
    public List<Error> query(ErrorQueryDTO errorQueryDTO) {
        String machineId = errorQueryDTO.getMachineId();
        Integer errorCode = errorQueryDTO.getErrorCode();

        LocalDateTime start = errorQueryDTO.getStartDate();
        LocalDateTime end = errorQueryDTO.getEndDate();
        return errorRepository.findAllByMachineAndErrorDefinitionAndBetweenDates(machineId, errorCode, start, end);
    }


}
