package com.melexis.reportapp.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;


/**
 * Created By Moon
 * 18/12/2021, za
 **/

@Entity
@Data
@NoArgsConstructor
public class Error extends AbstractEntity {

    @Id
    private String id;


    @ManyToOne
    @JoinColumn(name = "errorCode")
    private ErrorDefinition errorDefinition;

    @OneToOne
    private Machine machine;

    @Column
    private LocalDateTime date;

    public Error(UUID randomUUID, Machine machine, ErrorDefinition errorDefinition, LocalDateTime dateTime) {

        this.id = randomUUID.toString();
        this.errorDefinition = errorDefinition;
        this.machine = machine;
        this.date = dateTime;

    }


}
