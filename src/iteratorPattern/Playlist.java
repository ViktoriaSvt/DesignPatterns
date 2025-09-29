package iteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    List<String> songs = new ArrayList<>();

    public void addSong(String song) {
        songs.add(song);
    }

    public Iterator iterator(String type) {
        switch (type) {
            case "shuffle":
                return new ShuffleIterator(this);
            case "simple":
                return new SimpleIterator(this);
            default:
                return new SimpleIterator(this);
        }
    }

}
