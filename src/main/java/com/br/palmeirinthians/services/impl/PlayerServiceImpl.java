package com.br.palmeirinthians.services.impl;

import com.br.palmeirinthians.mapper.PlayerMapper;
import com.br.palmeirinthians.model.dto.PlayerDto;
import com.br.palmeirinthians.repositories.PlayerRepository;
import com.br.palmeirinthians.services.PlayerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PlayerServiceImpl implements PlayerService {

    private static final Logger LOGGER = LoggerFactory.getLogger( PlayerServiceImpl.class );

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private PlayerMapper playerMapper;

    @Override
    public List<PlayerDto> getAll( )
    {
        LOGGER.debug( "Obtendo players" );

        return playerRepository.findAll( )
                .stream( )
                .map( playerMapper::asPlayerDto )
                .collect( Collectors.toList( ) );
    }

    @Override
    public Optional<PlayerDto> getById(Long id )
    {
        LOGGER.debug( "Obtendo player pelo id" );

        return playerRepository.findById( id )
                .map( playerMapper::asPlayerDto );
    }
}
