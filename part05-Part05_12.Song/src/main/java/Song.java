
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public String getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }
    
    
    @Override
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        
        if (!(compared instanceof Song)){
            return false;
        }
        
        Song comparedSong = (Song) compared;
        
        return (this.artist.equals(comparedSong.getArtist())&&
                this.name.equals(comparedSong.getName())&&
                this.durationInSeconds == comparedSong.getDurationInSeconds());
        
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
