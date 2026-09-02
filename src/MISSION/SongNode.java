package MISSION;

public class SongNode {
    // 1. The data
    public String songTitle;

    // 2. The Link (This is Composition! An object holding a reference to an object of the same type)
    public SongNode nextSong;


    public SongNode(String Title) {
        songTitle = Title;
        nextSong = null;
    }
}