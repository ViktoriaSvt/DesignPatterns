package iteratorPattern;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ShuffleIterator implements Iterator {

    private Playlist playlist;
    private int index;
    private ArrayList<String> shuffledSongs;

    public ShuffleIterator(Playlist playlist) {
        this.playlist = playlist;
        this.shuffledSongs = new ArrayList<>(playlist.songs);
        Collections.shuffle(shuffledSongs);
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (shuffledSongs.size() > index) {
            return true;
        }
        return false;
    }

    @Override
    public String next() {
        return shuffledSongs.get(index++);
    }
}
