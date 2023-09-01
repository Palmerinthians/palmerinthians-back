package com.br.palmeirinthians.mapper;

import com.br.palmeirinthians.model.dto.PlayerDto;
import com.br.palmeirinthians.model.entity.PlayerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PlayerMapper {

    @Mapping( target = "playerCode", source = "playerCode" )
    @Mapping( target = "name", source = "name" )
    @Mapping( target = "age", source = "age" )
    @Mapping( target = "team", source = "team" )
    @Mapping( target = "position", source = "position" )
    PlayerDto asPlayerDto( PlayerEntity playerEntity );
}
