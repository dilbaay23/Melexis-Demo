package com.melexis.reportapp.service;

import com.melexis.reportapp.model.ErrorDefinition;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


/**
 * Created By Moon
 * 18/12/2021, za
 **/
@Service
public interface ErrorDefinitionService {

    ErrorDefinition save(ErrorDefinition errorDefinition);

    void delete(int errorCode);

    Optional<ErrorDefinition> findById(int errorCode);

    ErrorDefinition update(int errorCode, ErrorDefinition errorDefinition);

    List<ErrorDefinition> findAll();

    ErrorDefinition getOrSave(int errorCode, String errorDetail);

}
