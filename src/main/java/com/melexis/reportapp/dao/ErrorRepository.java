package com.melexis.reportapp.dao;

import com.melexis.reportapp.model.Error;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created By Moon
 * 18/12/2021, za
 **/
@Repository
public interface ErrorRepository extends JpaRepository<Error, String> {
}
