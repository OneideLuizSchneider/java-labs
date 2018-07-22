package com.graphql.music.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.graphql.music.model.Song;
import com.graphql.music.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author oneide.luiz.schneider
 */
@Component
public class SongMutation implements GraphQLMutationResolver {

    @Autowired
    private SongRepository songRepository;

    public Song newSong(String genre, String title) {
        Song song = new Song();
        song.setGenre(genre);
        song.setTitle(title);

        return songRepository.save(song);
    }
}
