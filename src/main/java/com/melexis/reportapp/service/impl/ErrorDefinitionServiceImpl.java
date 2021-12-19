package com.melexis.reportapp.service.impl;

import com.melexis.reportapp.dao.ErrorDefinitionRepository;
import com.melexis.reportapp.model.ErrorDefinition;
import com.melexis.reportapp.service.ErrorDefinitionService;
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
public class ErrorDefinitionServiceImpl implements ErrorDefinitionService {

    private final ErrorDefinitionRepository errorDefinitionRepository;
    private final ModelMapper modelMapper;


    @Override
    public ErrorDefinition save(ErrorDefinition errorDefinition) {
        return errorDefinitionRepository.save(errorDefinition);
    }

    @Override
    public void delete(int errorCode) {
        errorDefinitionRepository.deleteById(errorCode);
    }

    @Override
    public Optional<ErrorDefinition> findById(int errorCode) {
        return errorDefinitionRepository.findById(errorCode);

    }

    @Override
    public ErrorDefinition update(int errorCode, ErrorDefinition errorDefinition) {
        ErrorDefinition updatedErrorDef = errorDefinitionRepository.findById(errorCode)
                .orElseThrow(NoSuchElementException::new);

        modelMapper.getConfiguration().setSkipNullEnabled(true);
        modelMapper.map(errorDefinition, updatedErrorDef);

        return updatedErrorDef;
    }

    @Override
    public List<ErrorDefinition> findAll() {
        return errorDefinitionRepository.findAll();
    }

    @Override
    public ErrorDefinition getOrSave(int errorCode, String errorDetail) {
        return findById(errorCode)
                .orElseGet(() -> save(new ErrorDefinition(errorCode, errorDetail)));
    }
}
