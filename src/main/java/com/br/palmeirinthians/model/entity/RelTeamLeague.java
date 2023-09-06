package com.br.palmeirinthians.model.entity;

import com.br.palmeirinthians.generic.BaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class RelTeamLeague extends BaseModel {

    @ManyToOne
    @JoinColumn(name ="team_id", nullable = false)
    private TeamEntity team;

    @ManyToOne
    @JoinColumn(name = "league_id", nullable = false)
    private LeagueEntity league;

}
