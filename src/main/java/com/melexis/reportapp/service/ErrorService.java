package com.melexis.reportapp.service;

import com.melexis.reportapp.model.Error;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created By Moon
 * 18/12/2021, za
 **/
@Service
public interface ErrorService {

    Error save(Error error);

    void delete(String id);

    Error findById(String id);

    Error update(String id, Error error);

    List<Error> findAll();

}
