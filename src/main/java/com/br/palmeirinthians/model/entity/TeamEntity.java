package com.br.palmeirinthians.model.entity;

import com.br.palmeirinthians.generic.BaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;
import java.util.Set;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TeamEntity extends BaseModel {

    @Getter
    @Setter
    private Long teamCode;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    @OneToMany(mappedBy = "team")
    private List<RelTeamLeague> team;

    @Getter
    @OneToMany(mappedBy = "team")
    private Set<PlayerEntity> players;

}
