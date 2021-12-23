package com.melexis.reportapp.dao;

import com.melexis.reportapp.model.Error;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created By Moon
 * 18/12/2021, za
 **/
@Repository
public interface ErrorRepository extends JpaRepository<Error, String> {

    @Query(value = "From Error e where e.machine.id = :machineId and e.errorDefinition.errorCode = :errorCode and e.date BETWEEN :start and :end ")
    List<Error> findAllByMachineAndErrorDefinitionAndBetweenDates(@RequestParam("machineId") String machineId,
                                                                  @RequestParam("errorCode") Integer errorCode,
                                                                  @RequestParam("start") LocalDateTime start,
                                                                  @RequestParam("end") LocalDateTime end);
}
