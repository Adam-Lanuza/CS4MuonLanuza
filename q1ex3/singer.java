package q1ex3;

public class singer {
    String name;
    int noOfPerformances;
    double earnings;
    song favoriteSong;
    
    public singer(String name){
        this.name = name;
        this.noOfPerformances = 0;
        this.earnings = 0;
    }
   
    public void performForAudience(int audience) {
        this.noOfPerformances++;
        this.earnings += (audience * 100);
    }
    
    public void changeFavoriteSong(song songTitle) {
        this.favoriteSong = songTitle;
    }
    
    public void displayAll() {
        System.out.print(name + ",");
        System.out.print(noOfPerformances + ",");
        System.out.print(earnings + ",");
        System.out.print(favoriteSong.title);
        System.out.print("\n\n");
    }
}
