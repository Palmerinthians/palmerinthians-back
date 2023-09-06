package com.br.palmeirinthians.model.entity;

import com.br.palmeirinthians.generic.BaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PlayerEntity extends BaseModel {

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
    @JoinColumn(name = "team_id", nullable = false)
    private TeamEntity team;

    @Getter
    @Setter
    private String position;
}
