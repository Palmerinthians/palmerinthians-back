package com.br.palmeirinthians.model.entity;

import com.br.palmeirinthians.generic.BaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Entity
@Builder
public class TeamEntity extends BaseModel {

    @Getter
    @Setter
    private Long code;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    @ManyToMany
    private List<LeagueEntity> leagues;

    @Getter
    @OneToMany(mappedBy = "player")
    private List<PlayerEntity> players;

}
