package com.dcg.user.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "userDetail")
@NamedStoredProcedureQuery(name = "prock",
          procedureName = "prock",
           parameters = {
            @StoredProcedureParameter(mode = ParameterMode.IN, name = "uid" , type = Integer.class),
            @StoredProcedureParameter(mode = ParameterMode.IN, name = "uname" , type = String.class),
            @StoredProcedureParameter(mode = ParameterMode.IN, name = "uemail" , type = String.class),
            @StoredProcedureParameter(mode = ParameterMode.IN, name = "mob_number" , type = Long.class)

                           })

public class User implements Serializable{
    @Id
    private Integer id;

    private String name;

    private String email;

    private Long number;

}
