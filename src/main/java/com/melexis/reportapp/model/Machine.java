package com.melexis.reportapp.model;

import com.melexis.test.MachineType;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created By Moon
 * 18/12/2021, za
 **/
@Entity
@Data
@NoArgsConstructor
public class Machine extends AbstractEntity {

    @Id
    private String id;

    @Enumerated(value = EnumType.STRING)
    @Column
    private MachineType type;


    public Machine(String machineID, MachineType machineType) {
        this.id = machineID;
        this.type = machineType;
    }
}
