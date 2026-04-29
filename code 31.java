import java.util.LinkedList;

public class MusicPlaylist {

    public static void main(String[] args) {

        
        LinkedList<String> playlist = new LinkedList<>();

        
        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song D");
        playlist.add("Song E");

        
        System.out.println("Full Playlist:");
        displayPlaylist(playlist);

        
        System.out.println("\nPlaying first song: " + playlist.removeFirst());

        System.out.println("Playlist after playing first song:");
        displayPlaylist(playlist);

        
        System.out.println("\nSkipping last song: " + playlist.removeLast());

        System.out.println("Playlist after skipping last song:");
        displayPlaylist(playlist);
    }

    
    static void displayPlaylist(LinkedList<String> playlist) {
        for (String song : playlist) {
            System.out.println(song);
        }
    }
}