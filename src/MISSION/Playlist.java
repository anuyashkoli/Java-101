package MISSION;

import java.util.Scanner;

public class Playlist {
    // This is the only attribute you need. It points to the start of the scavenger hunt.
    private SongNode head = null;

    // Method to add a new song to the END of the playlist
    public void addSong(String title) {

        SongNode songNode = new SongNode(title);
        SongNode currentSong = head;

        // 2. If the playlist is completely empty (head is null), make this new node the head.
        if (head == null) {
            head = songNode;
        } else {
            while (songNode.nextSong != null) {
                songNode = songNode.nextSong;
            }
        }
        // 3. IF the playlist is NOT empty: You have to follow the links starting from 'head' until you find the last song (a song whose 'nextSong' is null). Once you find the last song, set its 'nextSong' to point to your new node.
    }
}