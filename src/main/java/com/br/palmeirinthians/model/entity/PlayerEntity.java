package com.br.palmeirinthians.model.entity;

import com.br.palmeirinthians.generic.BaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PlayerEntity extends BaseModel {

    @Id
    @Getter
    @Setter
    private Long playerCode;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private Integer age;

    @Getter
    @ManyToOne
    // TODO: Join column
    private TeamEntity team;

    @Getter
    @Setter
    private String position;
}
