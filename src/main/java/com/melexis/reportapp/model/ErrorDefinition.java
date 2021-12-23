package com.melexis.reportapp.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
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
@EqualsAndHashCode
public class ErrorDefinition {

    @Id
    private Integer errorCode;

    @Column
    private String errorDetail;


    public ErrorDefinition(int errorCode, String errorDetail) {
        this.errorCode = errorCode;
        this.errorDetail = errorDetail;
    }
}
