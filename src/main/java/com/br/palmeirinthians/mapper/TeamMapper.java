package com.br.palmeirinthians.mapper;

import com.br.palmeirinthians.model.dto.TeamDto;
import com.br.palmeirinthians.model.entity.TeamEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TeamMapper {

    @Mapping( target = "code", source = "code" )
    @Mapping( target = "name", source = "name" )
    @Mapping( target = "leagues", source = "leagues" )
    @Mapping( target = "players", source = "players" )
    TeamDto asTeamDto( TeamEntity teamEntity );
}
