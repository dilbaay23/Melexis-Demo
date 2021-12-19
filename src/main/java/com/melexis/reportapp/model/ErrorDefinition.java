package com.melexis.reportapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created By Moon
 * 18/12/2021, za
 **/
@Entity
@Data
@NoArgsConstructor
public class ErrorDefinition extends AbstractEntity {

    @Id
    private int errorCode;

    @Column
    private String errorDetail;


    public ErrorDefinition(int errorCode, String errorDetail) {
        this.errorCode = errorCode;
        this.errorDetail = errorDetail;
    }
}
