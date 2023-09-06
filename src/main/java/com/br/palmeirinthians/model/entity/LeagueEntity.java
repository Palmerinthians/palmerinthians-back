package com.br.palmeirinthians.model.entity;

import com.br.palmeirinthians.generic.BaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LeagueEntity extends BaseModel {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private Long code;

    @Getter
    @Setter
    @OneToMany(mappedBy = "league")
    private List<RelTeamLeague> league;
}
