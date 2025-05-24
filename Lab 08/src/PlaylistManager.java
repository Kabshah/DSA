class Song {
    int songID;String title;Song next;Song prev;
    public Song(int songID, String title) {
        this.songID = songID;this.title = title;this.next = null;
        this.prev = null;}}
class Playlist {
    Song head;
    public void addSong(int songID, String title) {
        Song newSong = new Song(songID, title);
        if (head == null) {
            head = newSong;
        } else {
            Song current = head;
            // Traverse to the last song in the playlist
            while (current.next != null) {
                current = current.next;}
            current.next = newSong;
            newSong.prev = current; }} // Set the previous song link
    public void displayPlaylist() {
        if (head == null) {
            System.out.println("Playlist is empty.");
            return;}
        Song current = head;
        while (current != null) {
            System.out.println("Song ID: " + current.songID + ", Title: " + current.title);
            current = current.next;}}
    public void reversePlaylist() {
        if (head == null) {
            System.out.println("Playlist is empty.");
            return;}
        Song current = head;
        // Traverse to the last song
        while (current.next != null) {
            current = current.next;}
        // Display the playlist in reverse order
        while (current != null) {
            System.out.println("Song ID: " + current.songID + ", Title: " + current.title);
            current = current.prev;}}}
public class PlaylistManager {
    public static void main(String[] args) {
        Playlist myPlaylist = new Playlist();
        myPlaylist.addSong(1, "Aha timatar baray mazedar");
        myPlaylist.addSong(2, "tota hoa saaz hon ma");
        myPlaylist.addSong(3, "moyee moyee");
        System.out.println("Playlist from start to end:");
        myPlaylist.displayPlaylist();
        System.out.println("\nPlaylist in reverse order:");
        myPlaylist.reversePlaylist();}}

/*3. You are managing a playlist system where each song is represented by a node in a doubly linked list. Each node contains:
•	Song ID (integer)
•	Song Title (string)
Your task is to:
a)	Insert a song at the end of the playlist.
b)	Display the playlist from start to end.
c)	Reverse the playlist and display it again.*/