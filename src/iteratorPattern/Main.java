package iteratorPattern;

import builderPattern.Clothing;
import builderPattern.enums.Color;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to my spotify!");

        Playlist playlist = new Playlist();
        playlist.addSong("Rock n Roll");
        playlist.addSong("NCT dream");
        playlist.addSong("Blackpink");
        playlist.addSong("Chef's menu");
        playlist.addSong("Best mistake");

        Iterator playlistIterator = playlist.iterator("shuffle");

        while (playlistIterator.hasNext()){
           String song =  playlistIterator.next();
            System.out.println("Playing o " + song);
        }

        Iterator playlistIterator1 = playlist.iterator("simple");
        System.out.println();
        while (playlistIterator1.hasNext()){
            String song =  playlistIterator1.next();
            System.out.println("Playing o " + song);
        }
    }
}