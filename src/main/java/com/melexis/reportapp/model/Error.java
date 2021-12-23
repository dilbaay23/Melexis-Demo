package com.melexis.reportapp.model;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

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
@EqualsAndHashCode
public class Error {

    @Id
    private String id;


    @ManyToOne
    @JoinColumn(name = "errorCode")
    private ErrorDefinition errorDefinition;

    @OneToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
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
