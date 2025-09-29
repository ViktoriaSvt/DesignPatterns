package iteratorPattern;

import java.util.ArrayList;

public class SimpleIterator implements Iterator{
    private Playlist playlist;
    private int index;

    public SimpleIterator(Playlist playlist) {
        this.playlist = playlist;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (playlist.songs.size() > index) {
            return true;
        }
        return false;
    }

    @Override
    public String next() {
        return playlist.songs.get(index++);
    }
}
