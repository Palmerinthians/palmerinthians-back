package com.br.palmeirinthians.model.adapter;

import com.br.palmeirinthians.model.dto.TeamDto;
import com.br.palmeirinthians.model.entity.TeamEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TeamAdapter {

    @Mapping( target = "code", source = "team.code" )
    TeamDto asTeamDto( TeamEntity teamEntity );
}
