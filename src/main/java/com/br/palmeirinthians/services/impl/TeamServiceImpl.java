package com.br.palmeirinthians.services.impl;

import com.br.palmeirinthians.mapper.TeamMapper;
import com.br.palmeirinthians.model.dto.TeamDto;
import com.br.palmeirinthians.repositories.TeamRepository;
import com.br.palmeirinthians.services.TeamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeamServiceImpl implements TeamService {

    private static final Logger LOGGER = LoggerFactory.getLogger( TeamServiceImpl.class );

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private TeamMapper teamMapper;

    @Override
    public List<TeamDto> getAll()
    {
        LOGGER.debug( "Obtendo os times" );

        return teamRepository.findAll( )
                .stream( )
                .map( teamMapper::asTeamDto )
                .collect( Collectors.toList( ) );
    }
}
