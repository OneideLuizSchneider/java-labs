package com.graphql.music.resolver;

import com.graphql.music.model.Song;
import com.graphql.music.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

/**
 *
 * @author oneide.luiz.schneider
 */
@Component
public class SongQuery implements GraphQLQueryResolver  {

    @Autowired
    private SongRepository songRepository;

    public Song getSong(String id) {
        return songRepository.find(id);
    }
}
