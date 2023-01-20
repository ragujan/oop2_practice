package collection_works.random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompareToSong {
    public static void main(String[] args) {
        CompareToSong cts = new CompareToSong();
        ArrayList<Song> songList = cts.makeSongList();

        System.out.println("Before compare ");
        songList.stream().forEach(song -> System.out.println(song.getTitle()));
        System.out.println("\n");

        CompareLength cl = new CompareLength();
        Collections.sort(songList, cl);
        System.out.println("Comparing lengths ");
        songList.stream().forEach(song -> System.out.println(song.getTitle()));
        System.out.println("\n");

        CompareRatings cr = new CompareRatings();
        Collections.sort(songList, cr);
        System.out.println("After comparing ratings ");
        songList.stream().forEach(song -> System.out.println(song.getTitle()));
        System.out.println("\n");

        CompareArtist ca = new CompareArtist();
        Collections.sort(songList, ca);
        System.out.println("After comparing artists ");
        songList.stream().forEach(song -> System.out.println(song.getTitle()));
        System.out.println("\n");

        CompareTitle ct = new CompareTitle();
        Collections.sort(songList, ct);
        System.out.println("After comparing title ");
        songList.stream().forEach(song -> System.out.println(song.getTitle()));
        System.out.println("\n");

    }

    public ArrayList<Song> makeSongList() {
        ArrayList<Song> songLIst = new ArrayList<>();
        Song legacy = new Song("Legacy", "Eminem", "77", 6);
        Song summerTime = new Song("Summertime", "Jenny Joplins", "8", 28);
        Song iwantyou = new Song("I want you", "Marvin gaye", "150", 75);
        Song greatestDancer = new Song("Greatest Dancer", "Sister Sledge", "20", 100);
        songLIst.add(legacy);
        songLIst.add(summerTime);
        songLIst.add(iwantyou);
        songLIst.add(greatestDancer);
        return songLIst;
    }
}

class Song implements Comparable<Song> {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }


    String title;

    public Song(String title, String artist, String rating, int length) {
        this.title = title;
        this.artist = artist;
        this.rating = rating;
        this.length = length;
    }

    String artist;
    String rating;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    int length;
    //comparing song
    public int compareTo(Song s) {
        return this.compareTo(s);
    }

}

class CompareRatings implements Comparator<Song> {
    public int compare(Song one, Song two) {
        return Integer.compare(Integer.parseInt(one.getRating()), Integer.parseInt(two.getRating()));
    }
}

class CompareTitle implements Comparator<Song> {
    public int compare(Song one, Song two) {
        return one.getTitle().compareTo(two.getTitle());
    }
}

class CompareArtist implements Comparator<Song> {
    public int compare(Song one, Song two) {
        return one.getArtist().compareTo(two.getArtist());
    }
}

class CompareLength implements Comparator<Song> {
    public int compare(Song one, Song two) {
        return Integer.compare(one.length, two.length);
    }
}