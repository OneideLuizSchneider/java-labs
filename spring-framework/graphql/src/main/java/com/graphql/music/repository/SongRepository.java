package com.graphql.music.repository;

import com.graphql.music.model.Song;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.springframework.stereotype.Component;

/**
 *
 * @author oneide.luiz.schneider
 */
@Component
public class SongRepository {

    private final Map<String, Song> songs;

    public SongRepository() {
        songs = new HashMap<>();
    }

    public Song save(Song song) {
        String id = UUID.randomUUID().toString();

        songs.put(id, song);
        song.setId(id);

        return song;
    }

    public Song find(String id) {
        return songs.get(id);
    }

}
