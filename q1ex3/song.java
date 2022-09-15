package q1ex3;

public class song {
    String title, artist;
    int duration;
    
    public song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }
    
    public void displayAll() {
        System.out.print(title + ",");
        System.out.print(artist + ",");
        System.out.print(duration);
        System.out.print("\n\n");
    }
}
