package com.br.palmeirinthians.mapper;

import com.br.palmeirinthians.model.dto.TeamDto;
import com.br.palmeirinthians.model.entity.TeamEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

//@Mapper(componentModel = "spring")
@Component
public interface TeamMapper {

    @Mapping( target = "teamCode", source = "teamCode" )
    @Mapping( target = "name", source = "name" )
    @Mapping( target = "leagues", source = "leagues" )
    @Mapping( target = "players", source = "players" )
    TeamDto asTeamDto( TeamEntity teamEntity );
}
